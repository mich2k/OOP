package it.gmichele.exceptions;

import java.util.ArrayList;

public class TryExcept<Integer> extends ArrayList<Integer> {

    public int getFifth (){
        TryExcept<Integer> arrList= this;

        return (int) arrList.get(4);
    }

}