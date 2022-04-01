package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord(){
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN,"stack");

        dictionary.addWord(polishWord, englishWord);

        assertEquals(1,dictionary.size());
    }

    @Test
    public void testFindEnglishWord(){
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));

        List<EnglishWord> result = dictionary.findEnglishWords("gra");

        List<EnglishWord> expectedList = new ArrayList<>();

        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"game"));

        assertEquals(2,result.size());
        assertEquals(expectedList,result);

    }

    @Test
    public void testFindEnglishWord_withPartOfSpeech(){
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.VERB,"brać"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));

        List<EnglishWord> result = dictionary.findEnglishWords("brać",PartOfSpeech.NOUN);

        List<EnglishWord> expectedList = new ArrayList<>();

        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));

        assertEquals(expectedList,result);
    }
}