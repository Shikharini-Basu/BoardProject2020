
class h
{private int[ ] a = {-10, -5, 1, 4, 8, 30};

public void doubleLast()
{

for (int i = a.length / 2; i < a.length; i++)
{
a[i] = a[i] * 2;
}
for(int j=0; j<=a.length-1; j++)
{ System.out.println(a[j]);
}
}
}