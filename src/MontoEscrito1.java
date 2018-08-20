
public class MontoEscrito1 {

	public String numeroletra (int numero)
	{
		String cadenaletra= new String();
		{
		//Para unidades de mil	
		if ((numero/1000)>0)
		{
			if ((numero/1000)==1)
			{
				cadenaletra="Mil "+numeroletra(numero%1000);
			}
			else
			{
				cadenaletra=numeroletra(numero/1000)+"Mil " + numeroletra(numero%1000);
			}
		}
		//Para definir centenas
		else
		{
			if ((numero/100)>0)
			{
				if ((numero/100)==1)
				{
					if ((numero%100)==0)
					{
						cadenaletra="Cien";
					}
					else
					{
						cadenaletra="Ciento "+numeroletra(numero%100);
					}
				}
				else
				{
					if ((numero/100)==5)
					{
						cadenaletra="Quinientos "+numeroletra(numero%100);
					}
					else
					{
						if ((numero/100)==9)
						{
							cadenaletra="Novecientos "+numeroletra(numero%100);
						}
						else
						{
							cadenaletra=numeroletra(numero/100)+"cientos "+numeroletra(numero%100);
						}
					}
				}
			}
		//Para definir las decenas
			else
			{
				if ((numero/10)>0)
				{
					switch ((int)(numero/10))
					{
					case 1:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Diez";break;
						case 1: cadenaletra="Once";break;
						case 2: cadenaletra="Doce";break;
						case 3: cadenaletra="Trece";break;
						case 4: cadenaletra="Catorce";break;
						case 5: cadenaletra="Quince";break;
						default:
							cadenaletra="Diez y " + numeroletra(numero%10);break;
						}
						break;
					case 2:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Veinte";break;
						default:
							cadenaletra="Veinti" + numeroletra(numero%10);break;
						}
						break;
					case 3:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Treinta";break;
						default:
							cadenaletra="Treinta y " + numeroletra(numero%10);break;
						}
						break;
					case 4:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Cuarenta";break;
						default:
							cadenaletra="Cuarenta y " + numeroletra(numero%10);break;
						}
						break;
					case 5:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Cincuenta";break;
						default:
							cadenaletra="Cincuenta y " + numeroletra(numero%10);break;
						}
						break;
					case 6:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Sesenta";break;
						default:
							cadenaletra="Sesenta y " + numeroletra(numero%10);break;
						}
						break;
					case 7:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Setenta";break;
						default:
							cadenaletra="Setenta y " + numeroletra(numero%10);break;
						}
						break;
					case 8:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Ochenta";break;
						default:
							cadenaletra="Ochenta y " + numeroletra(numero%10);break;
						}
						break;
					case 9:
						switch((int)(numero%10))
						{
						case 0: cadenaletra="Noventa";break;
						default:
							cadenaletra="Noventa y " + numeroletra(numero%10);break;
						}
						break;
					}
				}
				//Para definir las unidades
				else
				{
					switch((int)(numero))
					{
					//case 0: cadenaletra="Cero";break;
					case 1: cadenaletra="Uno";break;
					case 2: cadenaletra="Dos";break;
					case 3: cadenaletra="Tres";break;
					case 4: cadenaletra="Cuatro";break;
					case 5: cadenaletra="Cinco";break;
					case 6: cadenaletra="Seis";break;
					case 7: cadenaletra="Siete";break;
					case 8: cadenaletra="Ocho";break;
					case 9: cadenaletra="Nueve";break;
					}
				}
			}
		}
	}

	return cadenaletra;
}
}