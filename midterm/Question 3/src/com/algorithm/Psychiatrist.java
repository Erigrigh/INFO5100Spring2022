package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Psychiatrist {

    List<MoodyObject> moodyObjects = new ArrayList<>();

    //asks moody object about its mood
    public void examine(MoodyObject moodyObject){
        moodyObject.queryMood();
    }
    //a moodyObject is observed to either laugh or cry
    public void observe(MoodyObject moodyObject){

        for(MoodyObject mo : moodyObjects){
            if (moodyObject.getMood() == "happy"){
                moodyObject.toString();
                break;
            }

            if (moodyObject.getMood() == ("sad")){
                moodyObject.toString();
                break;
            }
        }
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(){
        System.out.println("Subject laughs a lot");
        return "Subject laughs a lot";
    }

    public void attach(MoodyObject moodyObject){
        moodyObjects.add(moodyObject);
    }


}
