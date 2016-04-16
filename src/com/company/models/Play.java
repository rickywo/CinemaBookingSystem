package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public abstract class Play {

    public static final int LOCALPLAY = 0;
    public static final int FOREIGNPLAY = 1;

    double standardRate;
    private String name;
    Play(String name) {
        this.name = name;
    }

    public double getStandardRate() {
        return standardRate;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();



    enum Type {
        LOCAL("Local"),
        FOREIGN("Foreign");

        private String typeName;
        Type(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }
    }
}
