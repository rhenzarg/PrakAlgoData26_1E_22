package jobsheet9;

public class StackSurat28 {
     Surat28[] stack;
    int top;
    int size;

    public StackSurat28(int size) {
        this.size = size;
        stack = new Surat28[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat28 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat28 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat28 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            stack[i].tampil();
        }
    }
}
