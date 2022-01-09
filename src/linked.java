
class linked {

    Bank head, tail;

    public linked() {
        head = null;
        tail = null;
    }

    public void enque() {
        Bank baru = new Bank();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void deque() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Keluar Data Dengan Id : " + head.id);
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for (Bank a = head; a != null; a = a.next) {
                a.read();
            }
        }
    }
//    public void view2() {
//        if (head == null) {
////            System.out.println("- Kosong -");
//              
//        } else {
//            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
//            for (Bank a = head; a != null; a = a.next) {
//                a.read();
//            }
//        }
//    }
}
