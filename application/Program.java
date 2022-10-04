package application;

import boardGame.Position;

import java.io.Serializable;
import java.util.HashMap;

public class Program implements Serializable {

    public static void main(String[] args)  {

        Position position= new Position(3,5);
        System.out.println(position);


    }
}
