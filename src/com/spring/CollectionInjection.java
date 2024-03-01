package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjection {

    private List<Integer> intList;
    private Set<String> strSet;
    private Map<String,Integer> strMap;

    public List<Integer> getIntList() {
        return intList;
    }
    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }
    public Set<String> getStrSet() {
        return strSet;
    }
    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }
    public Map<String, Integer> getStrMap() {
        return strMap;
    }
    public void setStrMap(Map<String, Integer> strMap) {
        this.strMap = strMap;
    }

    

}
