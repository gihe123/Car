/*
 * ����ͣ����ǰ������ͣ����ʽ
 */
public class Demo {
	//��λͳһ����
	//private double R;  //���������а뾶  
	//private double r1=6.5; //��������Сת��뾶
	//private double Z=0.02;//��ʻ���복��ǽ�İ�ȫ�����ȡ500-1000mm��ʵ��0.02��
	//private double L=3.43;//���
	//private double b=1.901;//���������
	//private double n=1.63;//ǰ�־�
	//private double e=1.077;//�����ߴ�
	//private double a=5.223;//����������
	//private double Lr;//��������ת��λ���ֻ�ת���ĵ�ƫ�ƾ���
	//private double S=0.02;//����ڴ����쳵�İ�ȫ����
	//private double c=0.02;//���복�ľ���
	//private static double an=50.00;//�Ƕ�
	//private double d=0.76  //ǰ���ߴ�
	//private static double pi=Math.PI;
	//private static double rad=pi*an/180;//����
	//private double d=0.76;//ǰ���ߴ�
	//private double afa=50
	
	//sin����
	private  static double return_sin(double a){
		double result=Math.sin(Math.PI*a/180);
		return result;
	}
	//cot����
	private static double return_cot(double a){
		double an_tan=90-a;		
		double result=(Math.tan(Math.PI*(an_tan)/180));
		return result;
	}
	//r����
	public static double return_r(double r1,double L,double b,double n){
		double result=Math.sqrt(Math.pow(r1, 2.0)-Math.pow(L, 2.0))-(b+n)/2;
		return result;
	}
	//R����
	public static double return_R(double L,double d,double r,double b){
		double result=Math.pow(Math.pow(L+d, 2.0)+Math.pow(r+b, 2.0), 1.0/2);
		return result;
	}
	//Lr����
	public static double return_Lr(double a,double e,double r,double s,double c,double b,double afa){
		double result=(a-e)-Math.sqrt(Math.pow(r-s, 2.0)-Math.pow(r-c, 2.0))+(c+b)*return_cot(afa);
		return result;
	}

	//Wd����
	public static double return_Wd(double R,double Z,double afa,double r,double b,double a,double e,double Lr){
		double result=R+Z-return_sin(afa)*((r+b)*return_cot(afa)-(a-e)-Lr);
		return result;
	}

}
