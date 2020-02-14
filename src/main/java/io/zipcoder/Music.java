package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int left = 0;
        int right = 0;

        int i = startIndex;
        int count = 0;
        while (!this.playList[i].equals(selection)) {
            if (i >= this.playList.length) {
                i = 0;
            } else if (i < 0) {
                i = this.playList.length -1;
            }
            i++;
            count++;
            if (i >= this.playList.length) {
                i = 0;
            } else if (i < 0) {
                i = this.playList.length -1;
            }
        }
        right = count;

        i = startIndex;
        count = 0;
        while (!this.playList[i].equals(selection)) {
            if (i >= this.playList.length) {
                i = 0;
            } else if (i < 0) {
                i = this.playList.length - 1;
            }
            i--;
            count++;
            if (i >= this.playList.length) {
                i = 0;
            } else if (i < 0) {
                i = this.playList.length -1;
            }
        }
        left = count;
        return (left < right) ? left : right;
    }
}
