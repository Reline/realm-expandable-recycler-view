package com.ryanbrooks.expandablerecyclerviewsample.VerticalLinearRecyclerViewSample;

import com.ryanbrooks.expandablerecyclerview.Model.ChildObject;
import com.ryanbrooks.expandablerecyclerview.Model.ParentObject;

/**
 * Created by Ryan Brooks on 5/28/15.
 */
public class CustomParentObject extends ParentObject {

    private String mData;
    private int mNumber;

    public CustomParentObject(int stableID, ChildObject childObject) {
        super(stableID, childObject);
    }

    public String getData() {
        return mData;
    }

    public void setData(String data) {
        mData = data;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }


}