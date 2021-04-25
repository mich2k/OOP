package it.gmichele.exceptions;

import java.util.ArrayList;

public class ThrowableTryExcept<E> extends ArrayList<E> {

    public int getSixth () throws ArrayIndexOutOfBoundsException{   // delego l exception al main
        ThrowableTryExcept<E> arrList= this;

        return (int) arrList.get(5);
    }
}
