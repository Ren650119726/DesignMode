package dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello() {
		System.out.println("Hello,World!");
	}

	public static void main(String[] args) {
		
		HelloService service = (HelloService) Proxy.newProxyInstance(
			HelloServiceImpl.class.getClassLoader(),
			new Class[]{HelloService.class}, 
			new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					if("sayHello".equals(method.getName())){
						System.out.println("-----begin----");
						method.invoke(proxy, args);
						System.out.println("----end----");
					}
					return null;
				}
			});
		service.sayHello();
	}
}
