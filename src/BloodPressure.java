
public class BloodPressure 
{
    double systolic,diastolic;
    String consultation,category;
    
    BloodPressure()
    {
        systolic=0.00;
        diastolic=0.00;
        consultation="";
        category="";
        
    }
    
    BloodPressure(double systolic,double diastolic,String consultation,String category)
    {
        this.systolic=systolic;
        this.diastolic=diastolic;
        this.consultation=consultation;
        this.category=category;
    }
    
    public double getSystolic()
    {
        return this.systolic;
    }
    
    public double getDiastolic()
    {
        return this.diastolic;
    }
    
    public String getConsultation()
    {
        return this.consultation;
    }
    
    public String getCategory()
    {
        return this.category;
    }
    
    public void setSystolic(double systolic)
    {
        this.systolic=systolic;
    }
    
    public void setDiastolic(double diastolic)
    {
        this.diastolic=diastolic;
    }
    
    public void setConsultation(String consultation)
    {
        this.consultation=consultation;
    }
    
    public void setCategory(String category)
    {
        this.category=category;
    }
    
    
    
}
