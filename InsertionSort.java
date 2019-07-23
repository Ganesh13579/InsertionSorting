package arrays;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort IS=new InsertionSort();
		int a[]= {10,9,13,8,7};
		IS.Sort(a);
		IS.print(a);
	}
	void Sort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 &&a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}
	void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
