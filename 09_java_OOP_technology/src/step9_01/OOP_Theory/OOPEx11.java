package step9_01.OOP_Theory;
/*

# 제네릭(Generic)

- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
- 객체의 타입을 컴파일 시점에 체크하기 때문에 
  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/

class Client{}
class Manager{}
class Supervisor{}


//제네릭을 구현하지 않았을 경우
class UnUsingGeneric{
	Client[] clients = new Client[3];
	Manager[] managers =new Manager[3];
	Supervisor[] supervisors = new Supervisor[3];
	
	int clientIdx = 0;
	int ManagerIdx =0;
	int supervisorIdx = 0;
	
	void add(Client C) {
		clients[clientIdx++] =C;
	}
	void add(Manager M) {
		managers[ManagerIdx++] = M;
		
	}
	void add(Supervisor s) {
		supervisors[supervisorIdx++] = s;
	}
	
	Client getClient(int index) {
		return clients[index];
	}
	
	Manager getManager(int index) {
		return managers[index];
	}
	Supervisor getSupervisor(int index) {
		return supervisors[index];
	}
	
	
	
}







//제네릭을 구현하였을 경우
class UsingGeneric<T>{
	
	Object[] arr = new Object[3];
	int elementIdx = 0;
	
	void add(T data) {
		arr[elementIdx++]=data;
	}
	
	T get(int index) {
		return (T)arr[index];
	}
}
public class OOPEx11 {
	
	public static void main(String[] args) {
	

		UsingGeneric<Client> clientList = new UsingGeneric<Client>();
		UsingGeneric<Manager> managerList = new UsingGeneric<Manager>();
		UsingGeneric<Supervisor> supervisorList = new UsingGeneric<Supervisor>();
		
		clientList.add(new Client());
		clientList.add(new Client());
		clientList.add(new Client());
		
		managerList.add(new Manager());
		managerList.add(new Manager());
		managerList.add(new Manager());
		

		supervisorList.add(new Supervisor());
		supervisorList.add(new Supervisor());
		supervisorList.add(new Supervisor());
		
		
		System.out.println(clientList.get(0));
		System.out.println(clientList.get(1));
		System.out.println(clientList.get(2));
		System.out.println();
		System.out.println(managerList.get(0));
		System.out.println(managerList.get(1));
		System.out.println(managerList.get(2));
		System.out.println();
		System.out.println(supervisorList.get(0));
		System.out.println(supervisorList.get(1));
		System.out.println(supervisorList.get(2));
		
		
		Client client = new Client();
		
		
		
		
		
	}

}
