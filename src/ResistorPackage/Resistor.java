/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResistorPackage;
import java.util.Random;
import java.awt.Color;
/**
 *
 * @author e-santry
 */
public class Resistor {
    private int nomResistance;
    private int tolerance;
    private double actualResistance;
    private double tolerancePercent;
    private double resistanceDiff;
    Random rand = new Random();
    
    public Resistor(int nomResistance, int tolerance) {
        this.nomResistance = nomResistance;
        this.tolerance = tolerance;
        
        boolean pm = rand.nextBoolean();
        int percentDiff = rand.nextInt(tolerance + 1);
        tolerancePercent = (double)percentDiff / 100.0;
        resistanceDiff = (double)this.nomResistance * tolerancePercent;
        
        if (pm)
            actualResistance = (double)this.nomResistance + resistanceDiff;
        if (!pm)
            actualResistance = (double)this.nomResistance - resistanceDiff;
    }
    
    public int getNomResist()
    {
        return nomResistance;
    }
    
    public int getTolerance()
    {
        return tolerance;
    }
    
    public double getActualResist()
    {
        return actualResistance;
    }
    
    public int[] getResistArray(long resistance)
    {
        String nomResistString = Long.toString(resistance);
        int size = nomResistString.length();
        int[] resistArray = new int[size];
        for(int i = 0; i < size; i++)
        {
            resistArray[i] = nomResistString.charAt(i) - '0';
        }
        return resistArray;
    }
    
    public Color getBand1Color(long resistance)
    {
        Color bandColor = Color.MAGENTA;
        int[] resistor = getResistArray(resistance);
        switch (resistor[0]) {
            case 0:
                bandColor = Color.BLACK;
                break;
            case 1:
                bandColor = new Color(102, 51, 0);
                break;
            case 2:
                bandColor = Color.RED;
                break;
            case 3:
                bandColor = Color.ORANGE;
                break;
            case 4:
                bandColor = Color.YELLOW;
                break;
            case 5:
                bandColor = Color.GREEN;
                break;
            case 6:
                bandColor = Color.BLUE;
                break;
            case 7:
                bandColor = new Color(102, 0, 153);
                break;
            case 8:
                bandColor = Color.GRAY;
                break;
            case 9:
                bandColor = Color.WHITE;
                break;
            default:
                break;
        }
        return bandColor;
    }
    
    public Color getBand2Color(long resistance)
    {
        Color bandColor = Color.MAGENTA;
        int[] resistor = getResistArray(resistance);
        switch (resistor[1])
        {
            case 0:
                bandColor = Color.BLACK;
                break;
            case 1:
                bandColor = new Color(102, 51, 0);
                break;
            case 2:
                bandColor = Color.RED;
                break;
            case 3:
                bandColor = Color.ORANGE;
                break;
            case 4:
                bandColor = Color.YELLOW;
                break;
            case 5:
                bandColor = Color.GREEN;
                break;
            case 6:
                bandColor = Color.BLUE;
                break;
            case 7:
                bandColor = new Color(102, 0, 153);
                break;
            case 8:
                bandColor = Color.GRAY;
                break;
            case 9:
                bandColor = Color.WHITE;
                break;
            default:
                break;
        }
        return bandColor;
    }
    
    public Color getBand3Color(long resistance)
    {
        Color bandColor = Color.MAGENTA;
        int[] resistor = getResistArray(resistance);
        int size = resistor.length;
        
        switch (size)
        {
            case 2:
                bandColor = Color.BLACK;
                break;
            case 3:
                bandColor = new Color(102, 51, 0);
                break;
            case 4:
                bandColor = Color.RED;
                break;
            case 5:
                bandColor = Color.ORANGE;
                break;
            case 6:
                bandColor = Color.YELLOW;
                break;
            case 7:
                bandColor = Color.GREEN;
                break;
            case 8:
                bandColor = Color.BLUE;
                break;
            case 9:
                bandColor = new Color(102, 0, 153);
                break;
            case 10:
                bandColor = Color.GRAY;
                break;
            case 11:
                bandColor = Color.WHITE;
                break;
            case 1:
                bandColor = new Color(255, 204, 51);
                break;
            case 0:
                bandColor = Color.LIGHT_GRAY;
                break;
            default:
                break;
        }
        return bandColor;
    }
    
    public Color getBand4Color()
    {
        Color bandColor = new Color(255, 204, 51);
        return bandColor;
    }
}
