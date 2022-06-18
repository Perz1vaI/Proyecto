package proyecto;

public class Campo {
    
    private String fieldName;
    private String dataType;
    private boolean mainKey;
    private int fieldSize;

    public Campo(String fieldName, String dataType, boolean mainKey, int fieldSize) {
        this.fieldName = fieldName;
        this.dataType = dataType;
        this.mainKey = mainKey;
        this.fieldSize = fieldSize;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public boolean isMainKey() {
        return mainKey;
    }

    public void setMainKey(boolean mainKey) {
        this.mainKey = mainKey;
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    @Override
    public String toString() {
        return fieldName+';'+dataType+';'+mainKey+';'+fieldSize+';';
    }
    
}