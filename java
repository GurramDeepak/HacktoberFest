import java.util.*;
class Tic_Tac_Toe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        int m[][]=new int[3][3];
        int p1,p2,i,a,b,c=0;
        String s1,s2;
        System.out.println("****************** WELCOME TO THE TICK-TACK-TOE GAME SHOW FOR 3X3 MATRIX***************");
        System.out.println("PLAYER 1 ENTERS THE VALUE AS'9' AND PLAYER 2 AS'6'");
        System.out.println("PLAYER 1 ENTER YOUR NAME");
        s1=in.next();
        System.out.println("PLAYER 2 ENTER YOUR NAME");
        s2=in.next();
        for(i=0;i<9;i++)
        {
            if(i%2==0)
            {
                System.out.println(s1+":Enter your row number and column number one by one");
                a=in.nextInt();
                b=in.nextInt();
                m[a][b]=9;
                for(a=0;a<3;a++)
                {
                    for(b=0;b<3;b++)
                    {
                        System.out.print(m[a][b]+"");
                    }
                    System.out.println();
                }
                a=0;b=0;
                if(m[0][0]==m[2][2] && m[1][1]==m[2][2])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"WINS");
                         c++;
                         break;
                    }
                    else
                    if(m[1][1]==6)
                    {
                         System.out.println(s2+"WINS");
                         c++;
                         break;
                        }
                    }
                else if(m[0][2]==m[2][2] && m[1][1]==m[2][2])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"WINS");
                         c++;
                         break;
                    }
                    else
                    if(m[1][1]==6)
                    {
                         System.out.println(s2+" wins");
                         c++;
                         break;
                    }
                }
                else if(m[0][1]==m[2][1] && m[1][1]==m[2][1])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"wins");
                         c++;
                         break;
                    }
                    else if(m[1][1]==6)
                    {
                         System.out.println(s2+"wins");
                         c++;
                         break;
                    }
                }
                else if(m[1][0]==m[1][2] && m[1][1]==m[1][2])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+" wins");
                         c++;
                         break;
                    }
                    else
                    if(m[1][1]==6)
                    {
                         System.out.println(s2+"wins");
                         c++;
                         break;
                    }
                }
            }
            else 
            {
                System.out.println(s2+":Enter your row number and column number one by one");
                a=in.nextInt();
                b=in.nextInt();
                m[a][b]=6;
                for(a=0;a<3;a++)
                {
                    for(b=0;b<3;b++)
                    {
                        System.out.print(m[a][b]+"");
                    }
                    System.out.println();
                }
                a=0;b=0;
                if(m[0][0]==m[2][2] && m[1][1]==m[2][2])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"wins");
                         c++;
                         break;
                    }
                    else
                    if(m[1][1]==6)
                    {
                         System.out.println(s2+" wins");
                         c++;
                         break;
                        }
                    }
                else if(m[0][2]==m[2][2] && m[1][1]==m[2][2])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"wins");
                         c++;
                         break;
                    }
                    else
                    if(m[1][1]==6)
                    {
                         System.out.println(s2+"wins");
                         c++;
                         break;
                    }
                }
                else if(m[0][1]==m[2][1] && m[1][1]==m[2][1])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"wins");
                         c++;
                         break;
                    }
                    else if(m[1][1]==6)
                    {
                         System.out.println(s2+"wins");
                         c++;
                         break;
                    }
                }
                else if(m[1][0]==m[1][2] && m[1][1]==m[1][2])
                {
                    if(m[1][1]==9)
                    {
                         System.out.println(s1+"wins");
                         c++;
                         break;
                    }
                    else
                    if(m[1][1]==6)
                    {
                         System.out.println(s2+"wins");
                         c++;
                         break;
                    }
                }
            }
        }
        if(c==0)
        System.out.println("SORRY, NO PLYER /t wins??? TRY AGAIN.............");
    }
}

                
                
                
                
                
                
                
                
                
                
                
               
                        
                        
                        
                        
        
        
        
        
        
