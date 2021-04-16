package com.cess.day11;

public class CustomerView {
	private CustomerList cl = new CustomerList(10);

	public static void main(String[] args) {
		CustomerView cv = new CustomerView();
		cv.enterMainMenu();
	}

	public void enterMainMenu() {

		while (true) {
			System.out.println("\n-----------------客户信息管理软件-----------------");
			System.out.println();
			System.out.println("\t\t1 添 加 客 户");
			System.out.println("\t\t2 修 改 客 户");
			System.out.println("\t\t3 删 除 客 户");
			System.out.println("\t\t4 客 户 列 表");
			System.out.println("\t\t5 退       出\n");
			System.out.print("\t\t请选择(1-5)：");

			char menu = CMUtility.readChar();

			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("确定退出请选Y，否则选N");
				char exitChoice = CMUtility.readConfirmSelection();
				if (exitChoice == 'Y') {
					System.out.println("已退出程序");
					System.exit(0);
				}
				break;
			}
		}
	}

	private void addNewCustomer() {
		System.out.println("\n---------------------添加客户---------------------");
		Customer customer = new Customer();
		System.out.print("姓名：");
		customer.setName(CMUtility.readString(5));
		System.out.print("性别：");
		customer.setSex(CMUtility.readChar());
		System.out.print("年龄：");
		customer.setAge(CMUtility.readInt());
		System.out.print("电话：");
		customer.setTelphone(CMUtility.readString(15));
		System.out.print("邮箱：");
		customer.setEmail(CMUtility.readString(30));

		cl.addCustomer(customer);
		System.out.println("---------------------添加完成---------------------");
	}

	private void modifyCustomer() {
		System.out.println("\n---------------------修改客户---------------------");
		char choice;
		while(true){
			System.out.print("请选择待修改客户编号(-1退出)：");
			choice = CMUtility.readChar();
			if (choice == -1) {
				return;
			} else if (choice > cl.getCount() || choice < 1) {
				System.out.println("不存在此编号客户");
			} else {
				break;
			}
		}
		Customer customer = cl.getCustomer(choice - 1);
		System.out.print("姓名(" + customer.getName() + ")：");
		customer.setName(CMUtility.readString(5, customer.getName()));
		System.out.print("性别(" + customer.getSex() + ")：");
		customer.setSex(CMUtility.readChar(customer.getSex()));
		System.out.print("年龄(" + customer.getAge() + ")：");
		customer.setAge(CMUtility.readInt(customer.getAge()));
		System.out.print("电话(" + customer.getTelphone() + "：");
		customer.setTelphone(CMUtility.readString(12, customer.getTelphone()));
		System.out.print("邮箱(" + customer.getEmail() + ")：");
		customer.setEmail(CMUtility.readString(20, customer.getEmail()));

		System.out.println("---------------------修改完成---------------------");
	}

	private void deleteCustomer() {
		System.out.println("\n---------------------删除客户---------------------");
		System.out.print("请选择待删除客户编号(-1退出)：");
		int choice = CMUtility.readInt();
		if (choice == -1) {
			return;
		} else if (choice > cl.getCount() || choice < 1) {
			System.out.println("不存在此编号客户");
			return;
		}
		System.out.print("确认是否删除(Y/N)：");
		if (CMUtility.readConfirmSelection() == 'N') {
			return;
		}
		cl.deleteCustomer(choice - 1);
		System.out.println("---------------------删除完成---------------------");
	}

	private void listAllCustomers() {
		System.out.println("\n---------------------------客户列表---------------------------");
		if (cl.getCount() == 0) {
			System.out.println("没有客户记录");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] customers = cl.getAllCustomers();
			for (int i = 0; i < cl.getCount(); i++) {
				System.out.println((i + 1) + "\t" + customers[i].getName() + "\t" + customers[i].getSex() + "\t"
						+ customers[i].getAge() + "\t" + customers[i].getTelphone() + "\t" + customers[i].getEmail());
			}
		}
		System.out.println("-------------------------客户列表完成-------------------------");
	}

}
