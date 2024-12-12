package com.company.inventory.infraestructure.rest.response.rest;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@RequiredArgsConstructor
@Getter
public class ResponseRest {
    private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();


    public ArrayList<HashMap<String, String>> getMetadata() {
        return metadata;
    }


    public void setMetadata(String type,String code,String date) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type",type);
        map.put("code",code);
        map.put("date",date);
       this.metadata.add(map);
    }
}
