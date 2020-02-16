package by.tut.shershnev_s.service.impl;

import by.tut.shershnev_s.service.SevenTaskService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;


@Service
public class SevenTaskServiceImpl implements SevenTaskService {

    private static final int NUMBER_OF_ELEMENTS_FOR_SUMM = 2;
    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public int add(String stringForParse) {
        List<Integer> numbers = new ArrayList<>();
        int noNumbers = 0;
        if (stringForParse.equals("")) {
            logger.info("Empty line");
            return noNumbers;
        } else {
            String[] elementsOfString = stringForParse.split(",|:|\\||\\\\n");
            int number;
            for (String s : elementsOfString) {
                if (s.matches("\\d+")) {
                    number = Integer.parseInt(s);
                    numbers.add(number);
                }
            }
        }
        int summ = getSummOfSeveralElements(numbers, NUMBER_OF_ELEMENTS_FOR_SUMM);
        logger.info("Summ for current string " + stringForParse + " is: " + summ);
        return summ;

    }

    private int getSummOfSeveralElements(List<Integer> list, int numberOfElementsForSumm) {
        int summ = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i >= numberOfElementsForSumm) {
                break;
            }
            summ += list.get(i);
        }
        return summ;
    }
}