package com.spEl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spElConfig.xml");
        try {
            Demo demo = ctx.getBean("DemoObj", Demo.class);
            System.out.println(demo);

            /*
             * another way
             */
            SpelExpressionParser spelExpressionParser2 = new SpelExpressionParser();
            Expression expression = spelExpressionParser2.parseExpression("2 > 3 ? 200: 300");
            System.out.println(expression.getValue());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ((ClassPathXmlApplicationContext) ctx).close();
        }
    }
}
