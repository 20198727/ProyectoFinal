/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.Physics;
import java.math.MathContext;
/**
 *
 * @author lizandro
 */
public class PhysicsOperator 
{    
    private float result;
    
    
    public float AccelerationFormula(float val1, float val2, float val3)
    {
        result = ((val1*val1) - (val2*val2))/val3;
        return result;
    }
    
    public float average(float val1, float val2)
    {
        result = (val1 + val2)/2;
        return result;
    }
    
    public float Exponential(float Numero, int Exponente)
    {
        int iteration = 0;
        float X = Numero;
        do 
        {
           iteration = iteration++;
           Numero = X*Numero;
        }
        while (iteration < Exponente);
        
        result = Numero;
        return result;
    }
    
    public float SQRTof(float Numero, int Exponente)
    {
        
        return result;
    }
    
}
