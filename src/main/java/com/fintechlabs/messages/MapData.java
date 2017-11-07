package com.fintechlabs.messages;

import java.util.Collections;
import java.util.List;

public class MapData {

    private List<WordCount> dataList;

    public List<WordCount> getDataList() {
        return dataList;
    }

    public MapData(List<WordCount> dataList) {
        this.dataList = Collections.unmodifiableList(dataList);
    }

}
