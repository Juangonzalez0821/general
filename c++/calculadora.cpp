 main(){
 	float x1, x2, res;
 	int op;
 	
 	printf("1.Suma\n");
 	printf("2.Resta\n");
 	printf("3.Multiplicacion?\n");
 	printf("4.Division??\n");
 	
 	printf("Que operacion va a realizar?\n");
 	scanf("%d", &op);
 	
 	switch(op){
	 	case 1: 
		 
		  printf("Ingrese el primer numero: ");
		  scanf("%f" , &x1);
		  printf("Ingrese el segundo numero: ");
		  scanf("%f" , &x2);
		  res=x1+x2;
		  printf("\nResultado= %f" , x1+x2);
		break;
		  
		case 2:
		  printf("Ingrese el primer numero: ");
		  scanf("%f" , &x1);
		  printf("Ingrese el segundo numero: ");
		  scanf("%f" , &x2);
		  res=x1-x2;
		  printf("\nResultado= %f" , x1-x2);
		break;
		
		case 3:
		  printf("Ingrese el primer numero: ");
		  scanf("%f" , &x1);
		  printf("Ingrsese el segundo numero: ");
		  scanf("%f" , &x2);
		  res=x1*x2;
		  printf("\nResultado= %f" , x1*x2);
		break;
		
		case 4:
		  printf("Ingrese el primer numero: ");
		  scanf("%f" , &x1);
		  printf("Ingrse l segundo numero: ");
		  scanf("%f" , &x2);
		  
		  
		  res=x1/x2;
		  printf("\nResultado= %f" , x1/x2);
		break;
		defaut:
			printf("Opcion equivocada digite otra opcion");
		break;
	
	
	 }//Fin del switch
	 
	
	 
	return 0;
 }