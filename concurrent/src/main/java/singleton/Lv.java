package singleton;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 16:59 2020/2/15
 * @Modified By:
 */
public class Lv {
        public static void main(String[] args) {
            System.out.println("aaa ");
            for(int i=1;i<10000;i++) {
                for(int j=1;j<10000;j++) {
                    for(int a =1;a<10000;a++) {
                        for(int b=1;b<10000;b++) {
                            if((1.25*i)>(j+a+b)) {
                                if((2*j)>(i+a+b)) {
                                    if((5*a)>(i+j+b)) {
                                        if((14*b)>(i+j+a)) {
                                            System.out.print(i+"--");
                                            System.out.print(j+"--");
                                            System.out.print(a+"--");
                                            System.out.print(b+"--");
                                            System.out.println();
                                        }
                                    }
                                }


                            }
                        }
                    }
                }
            }
            System.out.println("mmm");
        }

}
