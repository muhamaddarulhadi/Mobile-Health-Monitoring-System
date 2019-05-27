
public class BloodSugar 
{
    double glucoseValue;
    String consultation,category,fasting;
    
    BloodSugar()
    {
        glucoseValue=0.00;
        consultation="";
        category="";
        fasting="";
    }

    BloodSugar(double glucoseValue,String consultation,String category,String fasting)
    {
        this.glucoseValue=glucoseValue;
        this.consultation=consultation;
        this.category=category;
        this.fasting=fasting;
    }

    public void setGlucoseValue(double glucoseValue)
    {
        this.glucoseValue=glucoseValue;
    }
    
    public void setConsultation(String consultation)
    {
        this.consultation=consultation;
    }
    
    public void setCategory(String category)
    {
        this.category=category;
    }
    
    public void setFasting(String fasting)
    {
        this.fasting=fasting;
    }
    
    public double getGlucoseValue()
    {
        return this.glucoseValue;
    }
    
    public String getConsultation()
    {
        return this.consultation;
    }
    
    public String getCategory()
    {
        return this.category;
    }
    
    public String getFasting()
    {
        return this.fasting;
    }
      
}
