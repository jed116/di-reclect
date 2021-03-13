package tech.itpark.di;

import tech.itpark.di.intefaces.ParamStringInterface;

public class Repository implements ParamStringInterface {
    private String  paramString = "empty";
    private int     paramInt = 0;
    private boolean paramBool = false;

    public Repository() {
        paramString = "default";
        paramInt = 1;
        paramBool = false;
    }

    public Repository(int paramInt) {
        this.paramInt = paramInt;
    }

    public Repository(String paramString) {
        this.paramString = paramString;
    }

    public Repository(String paramString, int paramInt) {
        this.paramString = paramString;
        this.paramInt = paramInt;
    }

    public Repository(int paramInt, String paramString, boolean paramBool) {
        this.paramString = paramString;
        this.paramInt = paramInt;
        this.paramBool = paramBool;
    }

    @Override
    public String getParamString() throws NoSuchFieldException, IllegalAccessException {
        return paramString;
    }
}
