class MainLib
{
	public static void main(String args[])
	{
		byte b=8, c;
		Byte B=new Byte(b);
		c=B.byteValue();

		short s=9, t;
		Short S=new Short(s);
		t=S.shortValue();

		int i=90, j;
		Integer I=new Integer(i);
		j=I.intValue();

		long l=9000, m;
		Long L=new Long(l);
		m=L.longValue();

		float f=1.2f, g;
		Float F=new Float(f);
		g=F.floatValue();

		double d=8.9, e;
		double Do=new Double(d);
		e=Do.doubleValue();//error line

		char ch='A', hc;
		Character C=new Character(ch);
		hc=C.charValue();

		boolean bo=true, boo;
		Boolean Bo=new Boolean(bo);
		boo=Bo.booleanValue();

		System.out.print("Byte value: " + c +"Short value: " + t +"Integer value: " + j +"Long value: " + m +"Float value: " + g +"Double value: " + e +"Character value: " + hc +"Boolean value: " + boo);
	}
}