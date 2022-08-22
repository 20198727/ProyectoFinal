/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.Physics;

/**
 *
 * @author lizandro
 */
public class PhysicsObject 
{
    
    
    PhysicsOperator Operator = new PhysicsOperator();
    
    private float distance;
    private float height;
    
    private float time;
    private float initial_speed;
    private float final_speed;
    private float avrg_speed;
    private float gravity;
    
    private float initial_acceleration;
    private float final_acceleration;
    private float avrg_acceleration;
    private float mass;
    private float force;
    private float weight;
    
    
    
    private float momentum;
    
    public void Object()
    {
        
    }
    
    public void setValues(float dist, float hght, float tme, float innitSpd, float finalSpd, float avgSpd, float grv, float innitAcc, float finalAcc, float avgAcc, float mss,float frc, float whgt, float mmntm)
    {
         this.distance = dist;
         this.height = hght;
         
         this.time = tme;
         this.initial_speed = innitSpd;
         this.final_speed = finalSpd;
         this.avrg_speed = avgSpd;
         this.gravity = grv;
    
         this.initial_acceleration = innitAcc;
         this.final_acceleration = finalAcc;
         this.avrg_acceleration = avgAcc;
         this.mass = mss;
         this.force = frc;
         this.weight = whgt;
         
         
        
        if (time == 0)
        {
            time = distance / avgSpd;
        }
    }
    
    public float getDistance()
    {
        if(distance == 0 )
        {
            distance = time*avrg_speed;
        }
        return distance;
    }
    
    public float getHeight()
    {
        return height;
    }
    
    public float getInitialSpeed()
    {
        return initial_speed;
    }
    
    public float getFinalSpeed()
    {
        return final_speed;
    }
    
    public float getAverageSpeed()
    {
        if(avrg_speed == 0)
        {
            avrg_speed = Operator.average(final_speed, initial_speed);
        }
        
        if(avrg_speed == 0 && (final_speed == 0 && initial_speed == 0))
        {
            avrg_speed = distance/time ;
        }
        return avrg_speed;
    }
    
    public float getTime()
    {
        if (time == 0) 
        {
            time = distance/avrg_speed;
        }
        return time;
    }
    
    public float getInitialAcceleration()
    {
        return initial_acceleration;
    }
    
    public float getFinalAcceleration()
    {
        return final_acceleration;
    }
    
    public float getAvrgAcceleration()
    {
        if (initial_acceleration != 0 && final_acceleration != 0) 
        {
            avrg_acceleration = Operator.average(final_acceleration, initial_acceleration);
        } 
        
        else if ((initial_acceleration == 0 && final_acceleration == 0) && (initial_speed != 0 && final_speed != 0 && time != 0))
        {
            avrg_acceleration = (final_speed - initial_speed) / time;
        }
        
        return avrg_acceleration;
    }
    
    public float getMass()
    {
        if(mass == 0)
        {
            mass = weight/(9.8f);
        }
        
        if (weight == 0 && mass == 0)
        {
            mass = force/avrg_acceleration;
        }
        return mass;
    }
    
    public float getForce()
    {
        return force;
    }
    
    public float getGravity()
    {
        return gravity;
    }
    
    public float getWeight()
    {
        if (weight == 0)
        {
            weight = mass * 9.8f;
        }
        return weight;
    }
    
    public float getMommentum()
    {
        return momentum;
    }
}
