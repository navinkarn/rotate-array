package com.example.arrayrotate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayRotateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrayRotateApplication.class, args);
		int a[] = {1,2,3,4,5};
		int len = a.length;
		int numberOfRotation = 2;
		if(numberOfRotation % len == 0){
			printArray(a, len);
		}else{
			if(numberOfRotation > len){
				numberOfRotation = numberOfRotation -len;
			}
			for(int i=0; i < numberOfRotation; i++){
				int temp = a[0];
				for(int j=1; j <= len-1; j++){
					a[j-1] = a[j];
				}
				a[len-1] = temp;
			}
			printArray(a, len);
		}
	}

	public static void printArray(int a[], int len){
		System.out.println("The array after rotation is:");
		for (int k = 0; k < len; k++){
			System.out.print(a[k]);
		}
	}

}
