
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BloodPressureList 
{
    Node head;
    int count;
    int no=1;
    
    BloodPressureList()
    {
        head=null;
        count=0;
    }
    
    public void add(BloodPressure obj)
    {
        Node newNode=new Node(obj);
        if(head==null)                     //add to first
            head=newNode;
        else
        {
            Node current=head;
            while(current.getLink()!=null)   //add to last
                current=current.getLink();
            current.setLink(newNode);
        }
        count++;
    }
    
    public void display(DefaultTableModel model)//draft
    { 
        Node current=head;
        BloodPressure temp;

            while(current!=null)
            {
                temp=(BloodPressure)current.getObj();
                model.addRow(new Object[]{no,temp.getSystolic(),temp.getDiastolic(),temp.getCategory(),temp.getConsultation()});
                current=current.getLink();
                no++;    
            }
    }
    
    public void removeRow(DefaultTableModel model)
    {
        for(int remove=model.getRowCount()-1; remove>=0; remove--)
        model.removeRow(remove);
        no=1;
    }
    
    
    public void update(double oldsys,double olddias,double setsys,double setdias,String setcategory,String setconsultation)
    {
        Node current=head;   
        BloodPressure tempobj;
        while(current!=null)
        {
            tempobj=(BloodPressure)current.getObj();
            if((oldsys==tempobj.getSystolic())&&(olddias==tempobj.getDiastolic()))
            {
                tempobj.setSystolic(setsys);
                tempobj.setDiastolic(setdias);
                tempobj.setConsultation(setconsultation);
                tempobj.setCategory(setcategory);
            }
            current=current.getLink();
        }
    }
    
    public void delete(double sys,double dias)
    {
        Node before = null;
        Node current=head;
        BloodPressure tempobj1;
        boolean delete=false;
        boolean loop=false;
        
        BloodPressure test=(BloodPressure)head.getObj();
        
        if(head==null)
            JOptionPane.showMessageDialog(null, "List is empty", "Error",JOptionPane.ERROR_MESSAGE);
        else if((test.getSystolic()==sys)&&(test.getDiastolic()==dias))
            head=head.getLink();
        else
        {
        while(delete==false && current!=null)
        {
            tempobj1=(BloodPressure)current.getObj();
            loop=false;
            while((tempobj1.getSystolic()!=sys)&&(tempobj1.getDiastolic()!=dias)&&loop==false)
            {
                before=current;
                current=current.getLink();
                loop=true;
            }
            if((tempobj1.getSystolic()==sys)&&(tempobj1.getDiastolic()==dias))
            {
                before.link=current.link;
                delete=true;
            }
            
        }
        }//else
    }
}
