
package com.gyang.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.shib.java.lib.diction.DictionService;
import me.shib.java.lib.diction.DictionWord;
import me.shib.java.lib.diction.DictionWord.DictionDesc;

public class DictionaryService
{
    private DictionaryService _instance;
    private DictionService _service = new DictionService();

    private DictionaryService()
    {}

    public DictionaryService getInstance()
    {
        if (_instance == null) {
            _instance = new DictionaryService();
        }
        return _instance;
    }
    
    public Map<String, String> getDescription(String input)
    {
        Map<String, String> result = new HashMap<>();
        for (DictionDesc desc : _service.getDictionWord(input).getDescriptions()) {
            String type = desc.getWordType();
            System.out.println(desc.getDescription());
        }
        return result;
    }
}
