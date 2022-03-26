package com.algorithm;

public class SadObject extends MoodyObject {
    //returns string indicating sad

    public String getMood(){
        return "sad";
    }

    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    public void expressFeelings(){
        System.out.println("'waah’" + "‘boo hoo’" + "‘weep’" + "‘sob’");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        System.out.println("Observation:" + " Subject cries a lot");
        return "Subject cries a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("I feel Sad today!!");
        expressFeelings();
    }
}
