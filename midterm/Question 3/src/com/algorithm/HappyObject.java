package com.algorithm;

public class HappyObject extends MoodyObject {


    //returns string indicating happy
    public String getMood(){
        //String s = toString();
        return "happy";
    }
    //print laughter string “heeehee....hahahah...HAHAHA!!”
    public void expressFeelings(){
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(){
        System.out.println("Observation:" + " Subject laughs a lot");
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood() {

        System.out.println("I feel Happy today!!");
        expressFeelings();
    }
}
