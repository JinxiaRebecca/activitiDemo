package activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;

/** 
* @author  : Rebecca Jin
* @version ：2019年4月20日 下午4:32:57 
* 类说明 
*/
public class HelloActiviti {
	ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();
	
	/** 
	 * 部署流程定义
	 */
	@Test
	public void testProcessDeployment() {
		//获得部署构建器对象,用于加载流程定义文件
		DeploymentBuilder builder= processEngine.getRepositoryService().createDeployment();
		//加载流程定义文件
		builder.addClasspathResource("test1.bpmn");
		builder.addClasspathResource("test1.png");
		//部署流程
		Deployment deployment = builder.deploy();
		System.out.println(deployment.getId());
		
		
	}
	
	
}

