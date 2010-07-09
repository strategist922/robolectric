package com.xtremelabs.droidsugar.view;

import android.content.*;
import android.os.*;

import java.io.*;
import java.util.*;

@SuppressWarnings({"UnusedDeclaration"})
public class FakeIntent {
    private Intent realIntent;
    public HashMap extras;
    public String action;
    public Class<?> componentClass;

    public FakeIntent(Intent realIntent) {
        this.realIntent = realIntent;
    }

    public void __constructor__(Context packageContext, Class cls) {
        componentClass = cls;
    }

    public Intent setAction(String action) {
        this.action = action;
        return realIntent;
    }

    public Bundle getExtras() {
        return new Bundle();
    }

    public void putExtra(String key, long value) {
        init();
        extras.put(key, value);
    }

    public void putExtra(String key, Serializable value) {
        init();
        extras.put(key, value);
    }

    public void putExtra(String key, Parcelable value) {
        init();
        extras.put(key, value);
    }

    public void putExtra(String key, String value) {
        init();
        extras.put(key, value);
    }

    public Parcelable getParcelableExtra(String name) {
        return (Parcelable) extras.get(name);
    }

    private void init() {
        if (extras == null) {
            extras = new HashMap();
        }
    }
}