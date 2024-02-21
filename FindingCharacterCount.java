int count = 0;

char search = 'a';

for (int i = 0; i < length; i++) {

    if (str.charAt(i) == search) {

        count++;

    }

}

System.out.println(count);
