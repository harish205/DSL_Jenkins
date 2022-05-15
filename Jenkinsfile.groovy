pipeline{
    agent any
          
    stages{
	  stage('stage1'){
	    steps{
		   sh ('echo hello world')
		   
		}
	  }
       stage('stage2'){
	    steps{
		   sh ('dsl job is done')
		   
		}
	  }
	}
}