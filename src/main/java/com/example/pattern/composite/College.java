package com.example.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

	//List 中 存放的是 Department
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

	// 構造器
	public College(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}

	// 重寫 add
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		//  將來實際業務中 Colleage 的 add 和  University add 不一定完全相同
		organizationComponents.add(organizationComponent);
	}

	// 重寫 remove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}

    // print 方法，就是輸出 University 包含的學院
    @Override
    protected void print() {
        // TODO Auto-generated method stub
        System.out.println("--------------" + getName() + "--------------");
        //遍歷 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }


}
