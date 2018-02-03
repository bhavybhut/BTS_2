package admin;


import org.zkoss.zk.ui.util.Composer;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

public class DeleteUser implements Composer<Window>{

	private Label name,unm,desig,email,pm,dept;
	
	
	
	public Label getName() {
		return name;
	}

	public void setName(Label name) {
		this.name = name;
	}

	public Label getUnm() {
		return unm;
	}

	public void setUnm(Label unm) {
		this.unm = unm;
	}

	public Label getDesig() {
		return desig;
	}

	public void setDesig(Label desig) {
		this.desig = desig;
	}

	public Label getEmail() {
		return email;
	}

	public void setEmail(Label email) {
		this.email = email;
	}

	public Label getPm() {
		return pm;
	}

	public void setPm(Label pm) {
		this.pm = pm;
	}

	public Label getDept() {
		return dept;
	}

	public void setDept(Label dept) {
		this.dept = dept;
	}


	@Override
	public void doAfterCompose(Window comp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In doAfterCompose");
		User user = new User();
		user.setName(name.getValue());
		user.setUsername(unm.getValue());
		user.setDesignation(desig.getValue());
		user.setEmail(email.getValue());
		user.setPm(pm.getValue());
		user.setDept(dept.getValue());
		System.out.println("Completing method");
	}
}
