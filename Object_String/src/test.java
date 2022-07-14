class test {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        //使用equals()方法
        // 不同对象，内存地址不同，不相等，返回 false
        System.out.println(obj1.equals(obj2)); // false
        // obj1 赋值给 obj3
        // 对象引用，内存地址相同，相等，返回 true
        Object obj3 = obj1;
        System.out.println(obj1.equals(obj3)); // true

        //使用hashcode()方法,返回哈希值
        System.out.println(obj1.hashCode());//460141958
        System.out.println(obj2.hashCode());//1163157884

        //使用tostring()方法，返回类和地址
        System.out.println(obj1.toString());//java.lang.Object@1b6d3586
        System.out.println(obj2.toString());//java.lang.Object@4554617c

        //使用getclass()方法，返回类
        System.out.println(obj1.getClass());//class java.lang.Object
        System.out.println(obj2.getClass());//class java.lang.Object

        String str1="abc";
        String str2="  def  ";
        String str3="abc";
        //使用compareto()方法，比大小
        System.out.println(str1.compareTo(str2));//65

        //使用concat()方法，连接
        System.out.println(str1.concat(str2));//abc  def

        //使用equals()方法，判断相等
        System.out.println(str1.equals(str3));//true

        //使用trim()方法，去头尾空格
        System.out.println(str2.trim());//def

        //使用isempty()方法，判断是否为空
        System.out.println(str1.isEmpty());//false
    }

}
