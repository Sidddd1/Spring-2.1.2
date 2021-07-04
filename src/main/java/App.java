import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) context.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) context.getBean("helloworld");

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println(bean1 == bean2);
        System.out.println(cat1 == cat2);
    }
}