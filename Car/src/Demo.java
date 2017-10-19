/*
 * 后退停车，前进开出停车方式
 */
public class Demo {
	//单位统一是米
	//private double R;  //机动车外行半径  
	//private double r1=6.5; //机动车最小转弯半径
	//private double Z=0.02;//行驶车与车或墙的安全距离可取500-1000mm，实际0.02米
	//private double L=3.43;//轴距
	//private double b=1.901;//机动车宽度
	//private double n=1.63;//前轮距
	//private double e=1.077;//后悬尺寸
	//private double a=5.223;//机动车长度
	//private double Lr;//机动车回转入位后轮回转中心的偏移距离
	//private double S=0.02;//出入口处与领车的安全距离
	//private double c=0.02;//车与车的距离
	//private static double an=50.00;//角度
	//private double d=0.76  //前悬尺寸
	//private static double pi=Math.PI;
	//private static double rad=pi*an/180;//弧度
	//private double d=0.76;//前·尺寸
	//private double afa=50
	
	//sin函数
	private  static double return_sin(double a){
		double result=Math.sin(Math.PI*a/180);
		return result;
	}
	//cot函数
	private static double return_cot(double a){
		double an_tan=90-a;		
		double result=(Math.tan(Math.PI*(an_tan)/180));
		return result;
	}
	//r函数
	public static double return_r(double r1,double L,double b,double n){
		double result=Math.sqrt(Math.pow(r1, 2.0)-Math.pow(L, 2.0))-(b+n)/2;
		return result;
	}
	//R函数
	public static double return_R(double L,double d,double r,double b){
		double result=Math.pow(Math.pow(L+d, 2.0)+Math.pow(r+b, 2.0), 1.0/2);
		return result;
	}
	//Lr函数
	public static double return_Lr(double a,double e,double r,double s,double c,double b,double afa){
		double result=(a-e)-Math.sqrt(Math.pow(r-s, 2.0)-Math.pow(r-c, 2.0))+(c+b)*return_cot(afa);
		return result;
	}

	//Wd函数
	public static double return_Wd(double R,double Z,double afa,double r,double b,double a,double e,double Lr){
		double result=R+Z-return_sin(afa)*((r+b)*return_cot(afa)-(a-e)-Lr);
		return result;
	}

}
