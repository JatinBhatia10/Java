package javaprog;

public class linear{

 public boolean linearIn (int[] outer , int[] inner)
 { int numfound=0;
     if(inner.length==0){
    return true;
    }
     int k=0;
     for(int i=0;i<outer.length;i++)
     { if (outer[i]==inner[k])
     {numfound++;
     k++;
     }
     else if(outer[i]>inner[k])
     {return false;
         }
     if(numfound==inner.length)
         return true;
     }
     return false;
}
 public static void main(String[] args) {
    linear obj = new linear();
obj.linearIn(int[] outer , int[] inner);    
}
}
