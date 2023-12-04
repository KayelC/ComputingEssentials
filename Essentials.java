import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Essentials extends JFrame implements ActionListener{
    private JButton Module1;
    private SubMenuM1 subMenuM1;

    private JButton Module2;
    private SubMenuM2 subMenuM2;

    private JButton Module9;
    private SubMenuM9 subMenuM9;

    public Essentials() {
        super("Main Menu");

        Module1 = new JButton("Module 1");
        Module1.addActionListener(this);

        Module2 = new JButton("Module 2");
        Module2.addActionListener(this);

        Module9 = new JButton("Module 9");
        Module9.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
        buttonPanel.add(Module1);
        buttonPanel.add(Module2);
        buttonPanel.add(Module9);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.CENTER);

        setSize(400, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Module1) {
            subMenuM1 = new SubMenuM1();
            subMenuM1.setVisible(true);
        } else if (e.getSource() == Module9) {
            subMenuM9 = new SubMenuM9();
            subMenuM9.setVisible(true);
        } else if (e.getSource() == Module2) {
            subMenuM2 = new SubMenuM2();
            subMenuM2.setVisible(true);
        }
    }

    class SubMenuM2 extends JFrame implements ActionListener{
        private JButton Memory;
        private SubMenuM subMenuM;

        private JButton SysBus;
        private SubMenuSB subMenuSB;

        private JButton CPUReg;
        private SubMenuCPUR subMenuCPUR;

        private JButton IO;
        private SubMenuIO subMenuIO;
        public SubMenuM2() {
            super("Module 2 Menu");

            Memory = new JButton("Memory");
            Memory.addActionListener(this);

            SysBus = new JButton("System Bus");
            SysBus.addActionListener(this);

            CPUReg = new JButton("CPU Registers");
            CPUReg.addActionListener(this);

            IO = new JButton("I/O Peripherals");
            IO.addActionListener(this);

            JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
            buttonPanel.add(Memory);
            buttonPanel.add(SysBus);
            buttonPanel.add(CPUReg);
            buttonPanel.add(IO);

            getContentPane().setLayout(new BorderLayout());
            getContentPane().add(buttonPanel, BorderLayout.CENTER);

            setSize(400, 140);
            setLocationRelativeTo(null);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Memory) {
                subMenuM = new SubMenuM();
                subMenuM.setVisible(true);
            } else if (e.getSource() == SysBus) {
                subMenuSB = new SubMenuSB();
                subMenuSB.setVisible(true);
            } else if (e.getSource() == CPUReg) {
                subMenuCPUR = new SubMenuCPUR();
                subMenuCPUR.setVisible(true);
            } else if (e.getSource() == IO) {
                subMenuIO = new SubMenuIO();
                subMenuIO.setVisible(true);
            }
        }

        public class SubMenuIO extends JFrame implements ActionListener{
            private JButton USB;
            private JButton Flash;
            private JButton Serial;
            private JButton STrans;
            private JButton ATrans;

            public SubMenuIO() {
                USB = new JButton("Universal Serial Bus");
                USB.addActionListener(this);

                Flash = new JButton("Flash Ram");
                Flash.addActionListener(this);

                Serial = new JButton("Serial Data Transmission");
                Serial.addActionListener(this);

                STrans = new JButton("Synchronous Data Transmission");
                STrans.addActionListener(this);

                ATrans = new JButton("Asynchronous Data Transmission");
                ATrans.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                buttonPanel.add(USB);
                buttonPanel.add(Flash);
                buttonPanel.add(Serial);
                buttonPanel.add(STrans);
                buttonPanel.add(ATrans);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 180);
                setLocationRelativeTo(null);
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == USB) {
                    String explanation;

                    explanation = "USB ports are a standard interface used for connecting various devices to a computer or other electronic devices.\nUSB ports are versatile and support hot-swapping, meaning you can connect or disconnect devices without turning off the computer.\nThey provide power to connected devices and allow data transfer between the computer and peripherals such as keyboards, mice, printers, external hard drives, and more.";

                    JOptionPane.showMessageDialog(null, explanation, "Universal Serial Bus Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Flash) {
                    String explanation;

                    explanation = "Flash RAM, often referred to as Flash memory, is a type of non-volatile storage that retains data even when power is turned off.\nUSB flash drives use Flash RAM to store data.\nThese drives are portable and can be easily connected to a USB port.\nThey are commonly used for data storage, file transfer, and backup due to their compact size and ease of use.";

                    JOptionPane.showMessageDialog(null, explanation, "Flash Random Access Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                } else if (e.getSource() == Serial) {
                    String explanation, explanation2, explanation3;

                    explanation = "Definition: Serial data transmission is a method of sending data one bit at a time over a communication channel.\nIn contrast to parallel transmission, where multiple bits are sent simultaneously over separate channels,\nserial transmission uses a single channel for both transmitting and receiving data.";
                    explanation2 = "Advantages : \n- Simplicity : Serial communication is often simpler to implement than parallel communication.\n- Longer Distance : Serial transmission is suitable for long-distance communication.\n- Cost: It can be more cost-effective for certain applications.";
                    explanation3 = "Disadvantages : \n- Slower Speed : Serial transmission can be slower than parallel transmission for large amounts of data.\n- Complexity for Some Devices : Some devices may require parallel transmission for faster data transfer.";

                    JOptionPane.showMessageDialog(null, explanation, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation3, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                } else if (e.getSource() == STrans) {
                    String explanation, explanation2, explanation3;

                    explanation = "Definition : Synchronous transmission is a method of data communication where\ndata is sent in a continuous stream with regular timing signals to synchronize the sender and receiver.";
                    explanation2 = "Characteristics : \n- Clock Signals : Synchronous transmission uses clock signals to synchronize data transmission.\n- Fixed Timing : Data is sent in fixed, regular intervals.\n- Complex Implementation : Synchronous transmission requires more complex circuitry to maintain synchronization.";
                    explanation3 = "Applications : \n- High-speed data transfer where precise timing is crucial, such as in telecommunications and networking.";

                    JOptionPane.showMessageDialog(null, explanation, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation3, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                } else if (e.getSource() == ATrans) {
                    String explanation, explanation2, explanation3;

                    explanation = "Definition : Asynchronous transmission is a method of data communication where data is sent one character at a time,\nwith each character accompanied by start and stop bits to indicate the beginning and end of the data.";
                    explanation2 = "Characteristics : \n- No Continuous Clock Signal : Unlike synchronous transmission, asynchronous\ntransmission does not rely on a continuous clock signal.\n- Variable Timing : The time between characters can vary.\n- Simple Implementation : Asynchronous transmission is often simpler to implement than synchronous transmission.";
                    explanation3 = "Applications : \n- Low to moderate-speed data transfer where precise timing is not critical,\nsuch as in serial communication for keyboards, mice, and other peripherals.";

                    JOptionPane.showMessageDialog(null, explanation, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation3, " Explanation", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        public class SubMenuCPUR extends JFrame implements ActionListener{
            private JButton Data;
            private JButton Segment;
            private JButton Index;
            private JButton Stack;
            private JButton Control;
            private JButton Flag;
            private JButton Cache;

            public SubMenuCPUR(){
                super("CPU Registers Menu");

                Data = new JButton("Data Register");
                Data.addActionListener(this);

                Segment = new JButton("Segment Register");
                Segment.addActionListener(this);

                Index = new JButton("Index Register");
                Index.addActionListener(this);

                Stack = new JButton("Stack Register");
                Stack.addActionListener(this);

                Control = new JButton("Control Register");
                Control.addActionListener(this);

                Flag = new JButton("Flag/Status Register");
                Flag.addActionListener(this);

                Cache = new JButton("Cache Memory");
                Cache.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(4, 2, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                buttonPanel.add(Data);
                buttonPanel.add(Segment);
                buttonPanel.add(Index);
                buttonPanel.add(Stack);
                buttonPanel.add(Control);
                buttonPanel.add(Flag);
                buttonPanel.add(Cache);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 200);
                setLocationRelativeTo(null);

            }

            public void actionPerformed(ActionEvent e) {
                // Handle the button click action here
                if (e.getSource() == Data) {
                    String explanation;

                    explanation = "Data registers, also known as general-purpose registers, are used to store data temporarily during program execution.\nThese registers are the fastest in terms of access speed because they are located directly on the CPU chip.\nThe CPU can quickly read from or write to these registers, making them essential for arithmetic and logic operations.";

                    JOptionPane.showMessageDialog(null, explanation, "Data Register Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Segment) {
                    String explanation;

                    explanation = "Segment registers are part of the x86 architecture and are used to point to different segments of memory.\nSegmentation allows the division of memory into multiple segments, and segment registers hold the base address of these segments.\nThe combination of a segment register and an offset provides the actual memory address.";

                    JOptionPane.showMessageDialog(null, explanation, "Register Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Index) {
                    String explanation;

                    explanation = "Index registers are used for array and data structure manipulation.\nThey hold an offset address, which, when combined with a base address from another register, points to a specific memory location.\nThis is particularly useful in programming when dealing with arrays or structures.";

                    JOptionPane.showMessageDialog(null, explanation, "Register Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Stack) {
                    String explanation;

                    explanation = "Stack registers are crucial for managing the stack, a region of memory used for function calls, parameter passing, and local variable storage.\nThe stack operates on a Last-In, First-Out (LIFO) basis, and stack registers, like the stack pointer, help keep track of the current position on the stack.";

                    JOptionPane.showMessageDialog(null, explanation, "Register Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Control) {
                    String explanation;

                    explanation = "Control registers manage various aspects of CPU operation.\nThey include registers like the instruction pointer (EIP) that points to the next instruction to be executed.\nControl registers also control interrupt handling, virtual memory, and other essential system functions.";

                    JOptionPane.showMessageDialog(null, explanation, "Register Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Flag) {
                    String explanation;

                    explanation = "The Status or Flag register holds condition code flags that indicate the outcome of arithmetic and logic operations.\nCommon flags include zero, carry, overflow, and sign flags.\nThese flags are used for conditional branching in program execution.";

                    JOptionPane.showMessageDialog(null, explanation, "Register Explanation", JOptionPane.INFORMATION_MESSAGE);

                } else if (e.getSource() == Cache) {
                    String explanation, explanation2, explanation3;

                    explanation = "Cache memory is a small-sized type of volatile computer memory that provides high-speed data access to a processor and stores frequently used computer programs, applications, and data.\nIt is faster than main memory (RAM) but smaller in size.";
                    explanation2 = "Level 1 : - L1 cache is the smallest and fastest cache, located directly on the CPU chip.\n- It stores frequently used instructions and data.\n- Access speed is extremely high, reducing the time the CPU waits for data.";
                    explanation3 = "Level 2 : - L2 cache is larger but slower than L1 cache and is often shared among CPU cores.\n- It acts as a secondary cache to support the L1 cache.\n- Helps improve overall system performance by providing quick access to frequently used data.";

                    JOptionPane.showMessageDialog(null, explanation, "Cache Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Cache Memory (Level 1) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation3, "Cache Memory (Level 2) Explanation", JOptionPane.INFORMATION_MESSAGE);

                }
            }

        }

        public class SubMenuSB extends JFrame implements ActionListener{
            private JButton Aspects;
            private SubMenuSBA subMenuSBA;

            private JButton Properties;
            private SubMenuSBP subMenuSBP;
            public SubMenuSB(){
                super("System Bus Menu");

                Aspects = new JButton("Aspects");
                Aspects.addActionListener(this);

                Properties = new JButton("Properties");
                Properties.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                buttonPanel.add(Aspects);
                buttonPanel.add(Properties);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 140);
                setLocationRelativeTo(null);
            }

            public void actionPerformed(ActionEvent e) {
                // Handle the button click action here
                if (e.getSource() == Aspects) {
                    subMenuSBA = new SubMenuSBA();
                    subMenuSBA.setVisible(true);
                } else if (e.getSource() == Properties) {
                    subMenuSBP = new SubMenuSBP();
                    subMenuSBP.setVisible(true);
                }
            }

            class SubMenuSBP extends JFrame implements ActionListener{
                private JButton BusSize;
                private JButton SysClock;
                private JButton Decoders;
                private JButton DataTran;

                SubMenuSBP() {
                    super("System Bus Properties Menu");

                    BusSize = new JButton("Bus Size Consideration");
                    BusSize.addActionListener(this);

                    SysClock = new JButton("System Clock");
                    SysClock.addActionListener(this);

                    Decoders = new JButton("Decoders");
                    Decoders.addActionListener(this);

                    DataTran = new JButton("Data Transfer");
                    DataTran.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                    buttonPanel.add(BusSize);
                    buttonPanel.add(SysClock);
                    buttonPanel.add(Decoders);
                    buttonPanel.add(DataTran);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e){
                    if (e.getSource() == BusSize) {
                        String explanation, explanation2;

                        explanation  = "Definition : Bus size refers to the number of parallel lines or bits that a bus can transmit at a given time.\nIt is typically expressed in bits, such as an 8-bit bus or a 16-bit bus.";
                        explanation2  = "Importance : The bus size is crucial because it determines the amount of data that can be transferred between components in a single operation.\nA larger bus size allows for more data to be transferred simultaneously, potentially increasing the overall speed and efficiency of the system.";

                        JOptionPane.showMessageDialog(null, explanation, "Bus Size Consideration Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Bus Size Consideration Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == SysClock) {
                        String explanation, explanation2;

                        explanation  = "Definition : The system clock is a signal generated by the computer's clock oscillator circuit.\nIt provides a timing reference for the synchronized operation of various components within the system.";
                        explanation2  = "Importance :  The system clock helps coordinate and synchronize the activities of different components, especially those on the system bus.\nIt ensures that operations occur at the right time and in the correct order, preventing conflicts and ensuring the proper functioning of the system.";

                        JOptionPane.showMessageDialog(null, explanation, "System Clock Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "System Clock Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == Decoders) {
                        String explanation, explanation2;

                        explanation  = "Method : Decoders are used to enable specific devices on the bus selectively.\nEach device connected to the bus is assigned a unique address,\nand a decoder interprets the address signals to enable the corresponding device.";
                        explanation2  = "Importance : This method allows multiple devices to share a common bus without interfering with each other.\nWhen a device recognizes its unique address on the bus, it responds to the data transfer or control signals.\nIt enables efficient communication and resource sharing in a multi-device system.";

                        JOptionPane.showMessageDialog(null, explanation, "Interfacing Devices to a Common Bus Using Decoders", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Interfacing Devices to a Common Bus Using Decoders", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == DataTran) {
                        String explanation, explanation2, explanation3;

                        explanation  = "Synchronous Data Transfer : In synchronous data transfer, data is transferred between devices based on the system clock.\nThe timing of data transmission is synchronized with the clock signal.";
                        explanation2  = "Asynchronous Data Transfer : In asynchronous data transfer, there is no fixed timing relationship between the sender and receiver.\nData is sent without a synchronized clock signal.\nInstead, additional control signals, such as start and stop bits in asynchronous serial communication, indicate the beginning and end of data transmission.";
                        explanation3 = "Importance : Synchronous data transfer ensures a predictable and coordinated flow of data,\nwhile asynchronous transfer is often used when devices operate at different speeds or\nwhen exact timing synchronization is challenging.";

                        JOptionPane.showMessageDialog(null, explanation, "Synchronous Data Transfer Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Asynchronous Data Transfer Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation3, "Data Transfer Explanation", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

            class SubMenuSBA extends JFrame implements ActionListener{
                private JButton System;
                private JButton Address;
                private JButton Data;
                private JButton Control;

                SubMenuSBA() {
                    super("System Bus Aspects Menu");

                    System = new JButton("System Bus");
                    System.addActionListener(this);

                    Address = new JButton("Address Bus");
                    Address.addActionListener(this);

                    Data = new JButton("Data Bus");
                    Data.addActionListener(this);

                    Control = new JButton("Control Bus");
                    Control.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                    buttonPanel.add(System);
                    buttonPanel.add(Address);
                    buttonPanel.add(Data);
                    buttonPanel.add(Control);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    // Handle the button click action here
                    if (e.getSource() == Address) {
                        String explanation, explanation2;

                        explanation  = "Function : The Address Bus is responsible for carrying memory addresses.\nThese addresses are used by the CPU to specify the location in memory where data needs to be read from or written to.";
                        explanation2  = "Use : When the CPU wants to access data in the memory or send data to a specific memory location, it places the memory address on the Address Bus.\nThe memory or other devices use this address to identify the target location.";

                        JOptionPane.showMessageDialog(null, explanation, "Address Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Address Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == Data) {
                        String explanation, explanation2;

                        explanation  = "Function : The Data Bus is used to transmit actual data between the CPU and other components like memory or peripherals.";
                        explanation2  = "Use : When the CPU wants to read data from or write data to a specific memory location, it places the actual data on the Data Bus. This data is then transferred to or from the memory or peripheral devices.";

                        JOptionPane.showMessageDialog(null, explanation, "Data Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Data Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == Control) {
                        String explanation, explanation2;

                        explanation  = "Function : The Control Bus carries control signals that coordinate and manage the various activities within the computer system.\nThese signals control the flow of data and coordinate the actions of different components.";
                        explanation2  = "Use : Control signals include commands such as read, write, and various other control signals that manage the data transfer process.\nFor example, a read signal on the control bus indicates that the CPU is requesting data from a specific memory location.";

                        JOptionPane.showMessageDialog(null, explanation, "Control Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Control Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == System) {
                        String explanation, explanation2;

                        explanation  = "The System Bus is a critical component in computer architecture that facilitates communication between various components of a computer system.\nIt serves as a communication highway, allowing data and control signals to be transmitted between the CPU (Central Processing Unit), memory, and other peripheral devices.\nThe System Bus typically consists of three main types of buses: the Address Bus, Data Bus, and Control Bus.";
                        explanation2 = "In summary, the interaction between these buses is crucial for the proper functioning of a computer system.\nWhen the CPU needs to perform an operation, it uses the Address Bus to specify where the operation should occur,\nthe Data Bus to transfer the actual data, and the Control Bus to manage the process and signal the necessary actions.\nThis coordinated communication is fundamental to the execution of programs and the overall functioning of a computer.";

                        JOptionPane.showMessageDialog(null, explanation, "System Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "System Bus Explanation", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        public class SubMenuM extends JFrame implements ActionListener{
            private JButton RAM;
            private SubMenuMRAM subMenuMRAM;

            private JButton ROM;
            private SubMenuMROM subMenuMROM;

            public SubMenuM(){
                super("Memory Menu");

                RAM = new JButton("RAM");
                RAM.addActionListener(this);

                ROM = new JButton("ROM");
                ROM.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                buttonPanel.add(RAM);
                buttonPanel.add(ROM);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 140);
                setLocationRelativeTo(null);
            }

            public void actionPerformed(ActionEvent e) {
                // Handle the button click action here
                if (e.getSource() == RAM) {
                    subMenuMRAM = new SubMenuMRAM();
                    subMenuMRAM.setVisible(true);
                } else if (e.getSource() == ROM) {
                    subMenuMROM = new SubMenuMROM();
                    subMenuMROM.setVisible(true);
                }
            }

            class SubMenuMRAM extends JFrame implements ActionListener{
                private JButton Dynamic;
                private JButton Static;

                public SubMenuMRAM(){
                    super("Random Access Memory Menu");

                    Dynamic = new JButton("Dynamic");
                    Dynamic.addActionListener(this);

                    Static = new JButton("Static");
                    Static.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                    buttonPanel.add(Dynamic);
                    buttonPanel.add(Static);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e){
                    if (e.getSource() == Dynamic){
                        String explanation, explanation2;

                        explanation  = "Characteristics\n- Volatility: DRAM is volatile memory, meaning it loses its stored information when power is turned off. This is why it's used as temporary storage for active processes.\n- Storage Mechanism: Each memory cell in DRAM consists of a capacitor and a transistor. The information is stored as electrical charge in the capacitors, and these charges need to be refreshed thousands of times per second to prevent them from discharging and losing the data.\n- Speed: DRAM is generally slower than SRAM. Access times are in the range of nanoseconds.\n- Density: DRAM is more dense compared to SRAM, meaning it can store more data in a given physical space.";
                        explanation2 = "Applications\n- Main Memory (RAM): DRAM is commonly used as the main memory in computers. It provides the working space for the CPU to store and quickly access data that is actively being used.\n- Graphics Memory: DRAM is often used in graphics cards to store graphical data and textures temporarily.\n- System Cache: Some systems use DRAM as a cache to temporarily store frequently accessed data for quicker retrieval.";

                        JOptionPane.showMessageDialog(null, explanation, "DRAM Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "DRAM Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == Static){
                        String explanation, explanation2;

                        explanation  = "Characteristics\n- Volatility: Like DRAM, SRAM is volatile and loses its stored information when power is turned off.\n- Storage Mechanism: SRAM uses flip-flops to store each bit of data. Unlike DRAM, it does not require constant refreshing to maintain the data.\n- Speed: SRAM is faster than DRAM. Access times are typically measured in nanoseconds.\n- Stability: SRAM is more stable than DRAM, as it doesn't require periodic refreshing. However, it is more power-hungry and less dense.";
                        explanation2 = "Applications\n- Cache Memory: SRAM is commonly used in cache memory, which is a smaller, faster type of memory that stores frequently used instructions and data for quicker access by the CPU.\n- Registers: SRAM is used in CPU registers, providing fast access to the data that the CPU is actively processing.\n- Buffer Memory: SRAM is used in applications where speed and stability are crucial, such as in networking devices for buffering data during transmission.";

                        JOptionPane.showMessageDialog(null, explanation, "SRAM Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "SRAM Explanation", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

            class SubMenuMROM extends JFrame implements ActionListener{
                private JButton ROM;
                private JButton PROM;
                private JButton EPROM;
                private JButton EEPROM;

                public SubMenuMROM(){
                    super("Read Only Memory Menu");

                    ROM= new JButton("ROM");
                    ROM.addActionListener(this);

                    PROM = new JButton("PROM");
                    PROM.addActionListener(this);

                    EPROM = new JButton("EPROM");
                    EPROM.addActionListener(this);

                    EEPROM = new JButton("EEPROM");
                    EEPROM.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                    buttonPanel.add(ROM);
                    buttonPanel.add(PROM);
                    buttonPanel.add(EPROM);
                    buttonPanel.add(EEPROM);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e){
                    if (e.getSource() == ROM){
                        String explanation, explanation2;

                        explanation  = "Characteristics\n- Non-Volatile: ROM is non-volatile, meaning the data is permanently written during manufacturing and remains intact even when the power is turned off.\n- Read-Only: The data in ROM cannot be modified or rewritten by normal computer processes. It is 'read-only' in the sense that it can only be read, not written to.\n- Permanent Storage: ROM is used for storing firmware, BIOS (Basic Input/Output System), and other essential system software.";
                        explanation2 = "Applications\n- Bootstrapping: The initial code that the computer uses to boot up, often referred to as BIOS or firmware, is stored in ROM.\n- Embedded Systems: ROM is used in devices where the software does not need to be updated frequently, such as in appliances, embedded systems, and certain types of electronic devices.";

                        JOptionPane.showMessageDialog(null, explanation, "Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == PROM){
                        String explanation, explanation2;

                        explanation  = "Characteristics\n- One-Time Programmable: PROM is programmable by the user, but the programming is permanent and cannot be modified once written.\n- Non-Volatile: Similar to ROM, PROM retains its data even when the power is turned off.";
                        explanation2 = "Apllications\n- Customization: PROM is used in situations where the user needs to program the memory once with specific data or code, such as in manufacturing custom devices.";

                        JOptionPane.showMessageDialog(null, explanation, "Programmable Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Programmable Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == EPROM){
                        String explanation, explanation2;

                        explanation  = "Characteristics\n- Reprogrammable: Unlike ROM, EPROM is reprogrammable, but the process is not as simple as regular programming. It requires exposure to ultraviolet light to erase the existing data before new data can be written.\n- Non-Volatile: Similar to ROM, EPROM retains its data even when the power is turned off.\n- Limited Write Cycles: EPROM has a limited number of write/erase cycles compared to other types of memory.";
                        explanation2 = "Applications\n- Prototype Development: EPROMs are sometimes used during the development phase of hardware or software prototypes where frequent changes to the code are necessary.\n- Boot Code Storage: EPROMs are used in some systems to store boot code or critical firmware that may need occasional updates.";

                        JOptionPane.showMessageDialog(null, explanation, "Erasable Programmable Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Erasable Programmable Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == EEPROM){
                        String explanation, explanation2;

                        explanation  = "Characteristics\n- Electrically Erasable: EEPROM can be erased and reprogrammed electrically without the need for exposure to ultraviolet light.\n- Limited Write Cycles: EEPROM has a higher number of write/erase cycles compared to EPROM.\n- Non-Volatile: Like other ROM types, EEPROM retains its data even when the power is turned off.";
                        explanation2 = "Applications\n- Configuration Storage: EEPROM is commonly used to store configuration settings in electronic devices.\n- Firmware Updates: EEPROM is used in situations where firmware updates may be required, as it allows for multiple write/erase cycles.\n- Data Storage in Embedded Systems: EEPROM is used in applications where non-volatile storage is needed, and occasional updates to stored data are expected.";

                        JOptionPane.showMessageDialog(null, explanation, "Electronically Erasable Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Electronically Erasable Read Only Memory Explanation", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }        
    }

    class SubMenuM9 extends JFrame implements ActionListener{
        private JButton Databases;
        private SubMenuDB subMenuDB;

        public SubMenuM9() {
            super("Module 9 Menu");

            Databases = new JButton("Databases");
            Databases.addActionListener(this);

            JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
            buttonPanel.add(Databases);

            getContentPane().setLayout(new BorderLayout());
            getContentPane().add(buttonPanel, BorderLayout.CENTER);

            setSize(400, 140);
            setLocationRelativeTo(null);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Databases) {
                subMenuDB = new SubMenuDB();
                subMenuDB.setVisible(true);
            } 
        }

        public class SubMenuDB extends JFrame implements ActionListener {
            private JButton Basics;
            private SubMenuDBB subMenuDBB;

            private JButton Models;
            private SubMenuDBM subMenuDBM;

            public SubMenuDB() {
                super("Databases Menu");

                Basics = new JButton("Basics");
                Basics.addActionListener(this);

                Models = new JButton("Models");
                Models.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                buttonPanel.add(Basics);
                buttonPanel.add(Models);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 140);
                setLocationRelativeTo(null);
            }

            public void actionPerformed(ActionEvent e) {
                // Handle the button click action here
                if (e.getSource() == Basics) {
                    subMenuDBB = new SubMenuDBB();
                    subMenuDBB.setVisible(true);
                } else if (e.getSource() == Models) {
                    subMenuDBM = new SubMenuDBM();
                    subMenuDBM.setVisible(true);
                }
            }

            class SubMenuDBM extends JFrame implements ActionListener{
                private JButton Flat;
                private JButton H;
                private JButton Network;
                private JButton Relational;
                private JButton Object;

                public SubMenuDBM() {
                    super("Database Models Menu");

                    Flat = new JButton("Flat-File");
                    Flat.addActionListener(this);

                    H = new JButton("Hierarchical");
                    H.addActionListener(this);

                    Network = new JButton("Network");
                    Network.addActionListener(this);

                    Relational = new JButton("Relational");
                    Relational.addActionListener(this);

                    Object = new JButton("Object-Oriented");
                    Object.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(Flat);
                    buttonPanel.add(H);
                    buttonPanel.add(Network);
                    buttonPanel.add(Relational);
                    buttonPanel.add(Object);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    // Handle the button click action here
                    if (e.getSource() == Flat) {
                        String explanation;

                        explanation  = "- Stores data in a plain.txt file\n- Each Line will hold one record\n- Separated by Delimeters\n- Simple Structure but cannot contain multiple tables\n- Major Drawback is data redundance (duplicate data)";

                        JOptionPane.showMessageDialog(null, explanation, "Flat-File Database", JOptionPane.INFORMATION_MESSAGE);

                    } else if (e.getSource() == H) {
                        String explanation;

                        explanation  = "- Organises data in a tree-like Structure with one root\n- The child nodes can only have one parent\n- Does not allow relationshis between children\n- Due to tree structure, easy to access and update ";
                        JOptionPane.showMessageDialog(null, explanation, "Hierarchical Database", JOptionPane.INFORMATION_MESSAGE);

                    } else if (e.getSource() == Network) {
                        String explanation;

                        explanation  = "- Progression from Hierarchical\n- Designed to fix the lack of flexibility\n- Child nodes can have Multiple Parents\n- Child nodes are allowed to communicate\n- Comlex structure can cause operational abnormalities";
                        JOptionPane.showMessageDialog(null, explanation, "Network Database", JOptionPane.INFORMATION_MESSAGE);

                    } else if (e.getSource() == Relational) {
                        String explanation;

                        explanation  = "- Organises data into tables with rows and coloums\n- Unique key to identify each row\n- Usually uses SQL\n- Reduces Data Redundancy\n- Multi-user Acess\n- Complex Design and Maintainance";
                        JOptionPane.showMessageDialog(null, explanation, "Relational Database", JOptionPane.INFORMATION_MESSAGE);

                    } else if (e.getSource() == Object) {
                        String explanation;

                        explanation  = "- Developed to Support Object Oriented Programming\n- Designed to handle comlpex and large data\n- Better Integration with OOP\n- New System/Lack of Standard/Experience";
                        JOptionPane.showMessageDialog(null, explanation, "Object Oriented Database (OODBMS)", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }

            class SubMenuDBB extends JFrame implements ActionListener{
                private JButton Terms;
                private SubMenuDBT subMenuDBT;

                private JButton DBMS;
                private SubMenuDBMS subMenuDBMS;

                public SubMenuDBB() {
                    super("Databases Basics Menu");

                    Terms = new JButton("Terms");
                    Terms.addActionListener(this);

                    DBMS = new JButton("DBMS");
                    DBMS.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                    buttonPanel.add(Terms);
                    buttonPanel.add(DBMS);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    // Handle the button click action here
                    if (e.getSource() == Terms) {
                        subMenuDBT = new SubMenuDBT();
                        subMenuDBT.setVisible(true);
                    } else if (e.getSource() == DBMS) {
                        subMenuDBMS = new SubMenuDBMS();
                        subMenuDBMS.setVisible(true);
                    }
                }

                class SubMenuDBT extends JFrame implements ActionListener{
                    private JButton Strings;
                    private JButton Terminology;

                    public SubMenuDBT(){
                        super("Databases Basic Terms Menu");

                        Strings = new JButton("Facts");
                        Strings.addActionListener(this);

                        Terminology = new JButton("Terms");
                        Terminology.addActionListener(this);

                        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
                        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                        buttonPanel.add(Strings);
                        buttonPanel.add(Terminology);

                        getContentPane().setLayout(new BorderLayout());
                        getContentPane().add(buttonPanel, BorderLayout.CENTER);

                        setSize(400, 140);
                        setLocationRelativeTo(null);
                    }

                    public void actionPerformed(ActionEvent e) {
                        // Handle the button click action here
                        if (e.getSource() == Strings) {
                            String explanation, explanation2, explanation3;

                            explanation  = "A database is an organised collection of data or information.";
                            explanation2 = "A data dictionary is a collection of names, definitons and attribues about the data elements that are beuing used or caputured in a database.";
                            explanation3 = "The file manager is a system software responsible for the creation, deletion and modification of files.";

                            JOptionPane.showMessageDialog(null, explanation, "Databases Explanation", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation2, "Databases Explanation", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation3, "Databases Explanation", JOptionPane.INFORMATION_MESSAGE);

                        } else if (e.getSource() == Terminology) {
                            String explanation, explanation2, explanation3;

                            explanation = "Database Management System - DBMS - Controls The Database\nStructured Query Language - SQL - Language That Controls The Data\nData manipulation Language - DML - Manipulates and Manages data in a database.";
                            explanation2 = "Data Description Language - DDL - Creates and modifies the structure of the database\nData Query Language - DQL - Retrieves information or data from a database.";
                            explanation3 = "DML Commands - Insert, Delete, Update, Lock\nDDL Commands - Create, Drop, Alter, Truncate, Comment, Rename\nDQL Commands - Select";

                            JOptionPane.showMessageDialog(null, explanation, "Databases Explanation", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation2, "Databases Explanation", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation3, "Databases Explanation", JOptionPane.INFORMATION_MESSAGE);

                        }
                    }
                }

                class SubMenuDBMS extends JFrame implements ActionListener{
                    private JButton DBA;
                    private JButton Design;
                    private JButton Modelling;
                    private JButton CC;
                    private JButton Integrity;
                    private JButton Schema;

                    public SubMenuDBMS(){
                        super("DBMS Menu");

                        Schema = new JButton("Database Schema");
                        Schema.addActionListener(this);

                        DBA = new JButton("DB Admin");
                        DBA.addActionListener(this);

                        Design = new JButton("Database Design");
                        Design.addActionListener(this);

                        CC = new JButton("Creation and Configuration");
                        CC.addActionListener(this);

                        Modelling = new JButton("Data Modelling");
                        Modelling.addActionListener(this);

                        Integrity = new JButton("Data Integrity");
                        Integrity.addActionListener(this);

                        JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 10, 5));
                        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                        buttonPanel.add(DBA);
                        buttonPanel.add(Modelling);
                        buttonPanel.add(CC);
                        buttonPanel.add(Integrity);
                        buttonPanel.add(Schema);

                        getContentPane().setLayout(new BorderLayout());
                        getContentPane().add(buttonPanel, BorderLayout.CENTER);

                        setSize(400, 140);
                        setLocationRelativeTo(null);
                    }

                    public void actionPerformed(ActionEvent e) {
                        // Handle the button click action here
                        if (e.getSource() == DBA) {
                            String explanation, explanation2;

                            explanation  = "Database Administrator - DBA - Technical Person responsible for all activities related to creating/maintaining a database.";
                            explanation2 = "DBA Responsabilities - Design the database, Data Modelling, Database Creation and Configuration, Data Integrity,\nBackup and Recovery, Security Management, Documentation, Troubleshooting.";

                            JOptionPane.showMessageDialog(null, explanation, "Database Admin Explanation", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation2, "Database Admin Explanation", JOptionPane.INFORMATION_MESSAGE);

                        } else if (e.getSource() == Design) {
                            String explanation;

                            explanation = "Collaborate with stakeholders, Design Database Schema";

                            JOptionPane.showMessageDialog(null, explanation, "Design a Database", JOptionPane.INFORMATION_MESSAGE);
                        } else if (e.getSource() == CC) {
                            String explanation;

                            explanation = "Install and configure DBMS, Setting up database parameters and security.";

                            JOptionPane.showMessageDialog(null, explanation, "Database Creation and Configuration", JOptionPane.INFORMATION_MESSAGE);

                        } else if (e.getSource() == Modelling) {
                            String explanation;

                            explanation = "Creation of Entity Relationship Diagrams, Normalisation.";

                            JOptionPane.showMessageDialog(null, explanation, "Data Modelling", JOptionPane.INFORMATION_MESSAGE);

                        } else if (e.getSource() == Integrity) {
                            String explanation;

                            explanation = "Implement Data Validation";

                            JOptionPane.showMessageDialog(null, explanation, "Database Integrity", JOptionPane.INFORMATION_MESSAGE);

                        } else if (e.getSource() == Schema) {
                            String explanation, explanation2, explanation3;

                            explanation = "There are 3 Levels of Database Schema -\nExternal (User) Schema\nConceptual (Logical) Schema\nInternal (Phyiscal) Schema";
                            explanation2 = "1. External - Highest level of Abstraction, view the end user will have.\n2. Conceptual - Abstact Logical view of the database, Independant of DBMDS\n3. Internal - Lowest level of Abstraction, specific to particular DBMS\n,how the database is stored on the disk including datacompression.";
                            explanation3 = "The Goal is to seperate the user applications and the physical database.";

                            JOptionPane.showMessageDialog(null, explanation, "Design a Database", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation2, "Design a Database", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, explanation3, "Design a Database", JOptionPane.INFORMATION_MESSAGE);

                        }
                    }
                }
            }
        }
    }

    class SubMenuM1 extends JFrame implements ActionListener{
        private JButton BinSys;
        private SubMenuBS subMenuBS;

        private JButton DataConv;
        private SubMenuDC subMenuDC;

        private JButton BooleanA;
        private SubMenuBA subMenuBA;

        public SubMenuM1() {
            super("Module 1 Menu");

            BinSys = new JButton("Binary Systems");
            BinSys.addActionListener(this);

            DataConv = new JButton("Data Storage");
            DataConv.addActionListener(this);

            BooleanA = new JButton("Boolean Algebra");
            BooleanA.addActionListener(this);

            JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 5));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
            buttonPanel.add(BinSys);
            buttonPanel.add(DataConv);
            buttonPanel.add(BooleanA);

            getContentPane().setLayout(new BorderLayout());
            getContentPane().add(buttonPanel, BorderLayout.CENTER);

            setSize(400, 140);
            setLocationRelativeTo(null);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == BinSys) {
                subMenuBS = new SubMenuBS();
                subMenuBS.setVisible(true);
            } else if (e.getSource() == DataConv) {
                subMenuDC = new SubMenuDC();
                subMenuDC.setVisible(true);
            } else if (e.getSource() == BooleanA) {
                subMenuBA = new SubMenuBA();
                subMenuBA.setVisible(true);
            }
        }

        class SubMenuBA extends JFrame implements ActionListener{
            private JButton Commutative;
            private JButton Associative;
            private JButton Distributive;
            private JButton Demorgan;
            private JButton Absorption;
            private JButton Complement;
            private JButton Tautology;
            
            public SubMenuBA(){
                super("Boolean Algebra Menu");
                Commutative = new JButton("Commutative Law");
                Commutative.addActionListener(this);

                Associative = new JButton("Associative Law");
                Associative.addActionListener(this);

                Distributive = new JButton("Distributive Law");
                Distributive.addActionListener(this);

                Demorgan = new JButton("De'Morgans Law");
                Demorgan.addActionListener(this);

                Absorption = new JButton("Absorption Law");
                Absorption.addActionListener(this);

                Complement = new JButton("Double Complement Law");
                Complement.addActionListener(this);

                Tautology = new JButton("Laws of Tautology");
                Tautology.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                buttonPanel.add(Commutative);
                buttonPanel.add(Associative);
                buttonPanel.add(Distributive);
                buttonPanel.add(Demorgan);
                buttonPanel.add(Absorption);
                buttonPanel.add(Complement);
                buttonPanel.add(Tautology);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 200);
                setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == Commutative) {
                        String statement, example;

                        statement = "The order of application of two separate terms is not important";
                        example = "A . B = B . A\n A + B = B + A";

                        JOptionPane.showMessageDialog(null, statement, "Commutative Law", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, example, "Commutative Law", JOptionPane.INFORMATION_MESSAGE);
                    
                    } else if (e.getSource() == Associative) {
                        String statement, exampleOR, exampleAND;
            
                        statement = "Associative law allows the removal of brackets from an expression and regrouping of the variables";
    
                        exampleOR = "A + (B + C) = (A + B) + C = A + B + C";
    
                        exampleAND = "A (B . C) = (A . B) C = A . B . C ";
    
                        JOptionPane.showMessageDialog(null, statement, "Associative Law", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleOR, "Associative Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleAND, "Associative Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
                    
                    } else if (e.getSource() == Distributive) {
                        String statement, exampleOR, exampleAND;
        
                        statement = "Distributive Law permits the multiplying or factoring out of an expression.";

                        exampleOR = "A(B + C) = A . B + A . C";

                        exampleAND = "A+(B . C) = (A + B) . (A + C)";

                        JOptionPane.showMessageDialog(null, statement, "Distributive Law", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleOR, "Distributive Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleAND, "Distributive Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
                    
                    } else if (e.getSource() == Demorgan) {
                        String statement, exampleOR, explanationOR, explanationAND, exampleAND;
        
                        statement = "DeMorgan's Theorems describe the equivalence between gates with inverted inputs and gates with inverted outputs.";

                        explanationOR = "Two separate terms NOR'ed together is the same as the two terms inverted(Complemented) and AND'ed";
                        exampleOR = "(NOT A+B) = (NOT A) . (NOT B)";

                        explanationAND = "Two separate terms NAND'ed together is the same as the two terms inverted(Complemented) and OR'ed";
                        exampleAND = "(NOT A.B) = (NOT A) + (NOT B)";

                        JOptionPane.showMessageDialog(null, statement, "De Morgan's Law", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanationOR, "De Morgan's Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleOR, "De Morgan's Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanationAND, "De Morgan's Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleAND, "De Morgan's Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
                    
                    } else if (e.getSource() == Absorption) {
                        String statement, exampleOR, exampleAND;
        
                        statement = "Absorption Law enables a reduction in a complicated expression to a simpler one by absorbing like terms.";

                        exampleOR = "A + (A . B) = (A . 1) + (A . B) = A (1 . B ) = A";

                        exampleAND = "A (A + B) = (A + 0) . (A + B) = A + (0 . B) = A";

                        JOptionPane.showMessageDialog(null, statement, "Absorption Law", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleOR, "Absorption Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleAND, "Absorption Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
                    
                    } else if (e.getSource() == Complement) {
                        String statement, explanationOR, exampleOR, explanationAND,  exampleAND; 
        
                        statement = "The Complement is the inverse of a variable and is indicated by a bar over the variable as /Variable or in brackets as (NOT Variable)";

                        // OR GATE
                        explanationOR = "A term OR'ed with its complement equals '1'";
                        exampleOR = "A + (NOT A) = 1";

                        // AND GATE
                        explanationAND = "A term AND'ed with its complement equals '0'";
                        exampleAND = "A . (NOT A) = 0";

                        JOptionPane.showMessageDialog(null, statement, "Complement Law", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(null, explanationOR, "Complement Law - OR Operator", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleOR, "Complement Law - OR Operator", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(null, explanationAND, "Complement Law - AND Operator", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, exampleAND, "Complement Law - AND Operator", JOptionPane.INFORMATION_MESSAGE);
                    
                    } else if (e.getSource() == Tautology) {
                         String[] messages = {
                        "While not Boolean Laws in their own right, these are a set of Mathematical Laws which can be used in the simplification of Boolean Expressions.",
                        "0 . 0 = 0\nA 0 AND'ed with itself is always equal to 0",
                        "1 . 1 = 1\nA 1 AND'ed with itself is always equal to 1",
                        "1 . 0 = 0\nA 1 AND'ED with a 0 is equal to 0",
                        "0 + 0 = 0\nA 0 OR'ed with itself is always equal to 0",
                        "1 + 1 = 1\nA 1 OR'ed with itself is always equal to 1",
                        "1 + 0 = 1\nA 1 OR'ed with a 0 is equal to 1",
                        "/1 = 0\nThe Inverse(Complement) of a 1 is always equal to 0",
                        "/0 = 1\nThe Inverse(Complement) of a 0 is always equal to 1"
                        };
                        String title = "Tautology";
                        int index = 0;
                        while (index < messages.length) {
                            int option = JOptionPane.showOptionDialog(null, messages[index], title, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"🡢", "🡠"}, "Next");
                                if (option == JOptionPane.CLOSED_OPTION) {
                                    // User closed the dialog, exit the loop
                                    break;
                                } else if (option == 0) {
                                    index++;
                                } else if (option == 1 && index > 0) {
                                    index--;
                                }
                            } 
                        }
                    }           
                }
            
        class SubMenuDC extends JFrame implements ActionListener{
            private JButton Bit;
            private JButton Nibble;
            private JButton Byte;
            private JButton Kilobyte;
            private JButton Megabyte;
            private JButton Gigabyte;
            private JButton Terabyte;
            private JButton Formula;
            public SubMenuDC(){
                super("Data Storage Menu");

                Bit = new JButton("Bit");
                Bit.addActionListener(this);

                Nibble = new JButton("Nibble");
                Nibble.addActionListener(this);

                Byte = new JButton("Byte");
                Byte.addActionListener(this);

                Kilobyte = new JButton("Kilobyte");
                Kilobyte.addActionListener(this);

                Megabyte = new JButton("Megabyte");
                Megabyte.addActionListener(this);

                Gigabyte = new JButton("Gigabyte");
                Gigabyte.addActionListener(this);

                Terabyte = new JButton("Terabyte");
                Terabyte.addActionListener(this);

                Formula = new JButton("Formula");
                Formula.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                buttonPanel.add(Bit);
                buttonPanel.add(Nibble);
                buttonPanel.add(Byte);
                buttonPanel.add(Kilobyte);
                buttonPanel.add(Megabyte);
                buttonPanel.add(Gigabyte);
                buttonPanel.add(Terabyte);
                buttonPanel.add(Formula);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 200);
                setLocationRelativeTo(null);
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Bit) {
                    String explanation, explanation2;

                    explanation = "A bit is the smallest unit of digital information.";
                    explanation2 = "It can have a value of 0 or 1, representing binary code (binary digits).";

                    JOptionPane.showMessageDialog(null, explanation, "Bit (b) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Bit (b) Explanation", JOptionPane.INFORMATION_MESSAGE);
    
                } else if (e.getSource() == Nibble) {
                    String explanation, explanation2;

                    explanation = "A nibble consists of 4 bits.";
                    explanation2 = "It represents 16 possible values (2^4).";

                    JOptionPane.showMessageDialog(null, explanation, "Nibble Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Nibble Explanation", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (e.getSource() == Kilobyte) {
                    String explanation, explanation2;

                    explanation = "1 Kilobyte is equivalent to 1,024 bytes (2^10).";
                    explanation2 = "Commonly used to measure the size of small files or amounts of computer memory.";

                    JOptionPane.showMessageDialog(null, explanation, "Kilobyte (KB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Kilobyte (KB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (e.getSource() == Byte) {
                    String explanation, explanation2, explanation3;

                    explanation = "A byte comprises 8 bits.";
                    explanation2 = "It is the basic addressable element in computer memory.";
                    explanation3 = "Most computer systems use bytes to represent a character or a numerical value.";
                    
                    JOptionPane.showMessageDialog(null, explanation, "Byte (B) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Byte (B) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation3, "Byte (B) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (e.getSource() == Megabyte) {
                    String explanation, explanation2;

                    explanation = "1 Megabyte is equal to 1,024 kilobytes or 1,048,576 bytes (2^20).";
                    explanation2 = "Used to describe the size of files, storage capacity, or memory in a computer.";

                    JOptionPane.showMessageDialog(null, explanation, "Megabyte (MB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Megabyte (MB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (e.getSource() == Gigabyte) {
                    String explanation, explanation2;

                    explanation = "1 Gigabyte is equal to 1,024 megabytes or 1,073,741,824 bytes (2^30).";
                    explanation2 = "Commonly used to represent the capacity of hard drives, RAM, and the size of files.";

                    JOptionPane.showMessageDialog(null, explanation, "Gigabyte (GB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Gigabyte (GB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (e.getSource() == Terabyte) {
                    String explanation, explanation2;

                    explanation = "1 Terabyte is equal to 1,024 gigabytes or 1,099,511,627,776 bytes (2^40).";
                    explanation2 = "Used to measure large storage capacities, especially in modern hard drives and data centers.";

                    JOptionPane.showMessageDialog(null, explanation, "Terabyte (TB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Terabyte (TB) Explanation", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (e.getSource() == Formula) {
                    String explanation, explanation2, explanation3;

                    explanation = "The formula for converting between these units is : \nBytes = 2⁽¹⁰*ˣ⁾";
                    explanation2 = "Examples : \n- Bytes to Kilobytes : Kilobytes = 2¹⁰ x Bytes\n- Kilobytes to Megabytes : Megabytes = 2¹⁰ x Kilobytes\n- Megabytes to Gigabytes : Gigabytes = 2¹⁰ x Megabytes\n- Gigabytes to Terabytes : Terabytes = 2¹⁰ x Gigabytes ";
                    explanation3 = "This formula is based on the fact that each step in the binary system represents a factor of 2,\nand in the case of digital storage, it's a factor of 2 raised to the power of 10 for each step in the hierarchy.";
                    
                    JOptionPane.showMessageDialog(null, explanation, "Formula Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation2, "Formula Explanation", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, explanation3, "Formula Explanation", JOptionPane.INFORMATION_MESSAGE);
                
                }
            }
        }

        class SubMenuBS extends JFrame implements ActionListener{
            private JButton innerCBCD;
            private SubMenuBCD subMenuBCD;

            private JButton innerC2C;
            private SubMenu2C subMenu2C;

            private JButton innerCUS;
            private SubMenuUS subMenuUS;

            private JButton innerCSM;
            private SubMenuSM subMenuSM;

            public SubMenuBS() {
                super("Binary System Menu");

                innerCBCD = new JButton("Binary Coded Decimal");
                innerCBCD.addActionListener(this);

                innerC2C = new JButton("2's Complement");
                innerC2C.addActionListener(this);

                innerCUS = new JButton("Unsigned Integers");
                innerCUS.addActionListener(this);

                innerCSM = new JButton("Sign + Magnitude");
                innerCSM.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                buttonPanel.add(innerCBCD);
                buttonPanel.add(innerC2C);
                buttonPanel.add(innerCUS);
                buttonPanel.add(innerCSM);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 140);
                setLocationRelativeTo(null);
            }

            class SubMenuSMR extends JFrame implements ActionListener{
                private JButton explanation;
                private JButton checkrange;

                public SubMenuSMR(){
                    super("Sign + Magnitude Ranges Menu");

                    explanation = new JButton("Explanation");
                    explanation.addActionListener(this);

                    checkrange = new JButton("Check Range");
                    checkrange.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(explanation);
                    buttonPanel.add(checkrange);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400,140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == explanation) {
                        String explanation, explanation2, explanation3, explanation4;

                        explanation  = "Ranges refer to the set of values that can be represented by a particular data type or number system.\nIn computer programming, ranges are often used to determine the valid input values for a variable or to define the limits of a computation.";
                        explanation2 = "To Calculate The Range of a Sign+Magnitude Representation we must do the following :";
                        explanation3 = "Determine the number of bits used to represent the value. \n 4-bits";
                        explanation4 = "Calculate the minimum and maximum values. \n+/- 4 2 1\n1   1 1 1 = -7\n0   1 1 1 = +7";

                        JOptionPane.showMessageDialog(null, explanation, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation3, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation4, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);

                    } 
                    else if (e.getSource() == checkrange) {
                        while (true) {
                            // Read decimal input from the user
                            String input = JOptionPane.showInputDialog(null, "Enter The Number of Bits in the Representation :");

                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled");
                                break;
                            }

                            // Convert input string to integer
                            int bits;
                            try {
                                bits = Integer.parseInt(input);
                            }   catch (NumberFormatException f) { 
                                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                                continue;
                            }
                            // Calculate the maximum and minimum values
                            int maxValue = (int) Math.pow(2, bits - 1) - 1;  // maximum value is 2^(bits - 1) - 1
                            int minValue = -(int) Math.pow(2, bits - 1) + 1; // minimum value is -(2^(bits - 1)) + 1

                            JOptionPane.showMessageDialog(null, "Range of values in " + bits + "-bit Sign+Magnitude: \nMinimum value: "+ minValue + "\nMaximum value: "+ maxValue);

                        }
                    }
                }
            }

            class SubMenuSMW extends JFrame implements ActionListener {
                private JButton question1;
                private JButton question2;

                public SubMenuSMW() {
                    super("Sign + Magnitude Examples Menu");

                    question1 = new JButton("Question 1.");
                    question1.addActionListener(this);

                    question2 = new JButton("Question 2.");
                    question2.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
                    buttonPanel.add(question1);
                    buttonPanel.add(question2);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == question1) {
                        JOptionPane.showMessageDialog(null, "What is the Sign + Magnitude Representation of 33?");
                        int decimal = 33;
                        // Determine the sign and magnitude of the number
                        int sign = (decimal < 0) ? 1 : 0;
                        int magnitude = Math.abs(decimal);

                        // Convert magnitude to binary string
                        String binary = Integer.toBinaryString(magnitude);

                        // Pad binary string with leading zeros to ensure it has 8 bits
                        binary = String.format("%7s", binary).replace(' ', '0');

                        // Output the sign and binary representation of magnitude
                        JOptionPane.showMessageDialog(null, "Sign-Magnitude: " + sign + binary);
                        JOptionPane.showMessageDialog(null, "Sign: " + sign + "\nMagnitude: " + binary);
                    } else if (e.getSource() == question2) {
                        JOptionPane.showMessageDialog(null, "What is the Sign + Magnitude Representation of -78?");
                        int decimal = -78;
                        // Determine the sign and magnitude of the number
                        int sign = (decimal < 0) ? 1 : 0;
                        int magnitude = Math.abs(decimal);

                        // Convert magnitude to binary string
                        String binary = Integer.toBinaryString(magnitude);

                        // Pad binary string with leading zeros to ensure it has 8 bits
                        binary = String.format("%7s", binary).replace(' ', '0');

                        // Output the sign and binary representation of magnitude
                        JOptionPane.showMessageDialog(null, "Sign-Magnitude: " + sign + binary);
                        JOptionPane.showMessageDialog(null, "Sign: " + sign + "\nMagnitude: " + binary);
                    }
                }
            }

            class SubMenuSM extends JFrame implements ActionListener{
                private JButton explanation;
                private JButton checkinteger;

                private JButton innerCSMR;
                private SubMenuSMR subMenuSMR;

                private JButton worksheet;
                private SubMenuSMW subMenuSMW;

                public SubMenuSM() {
                    super("Sign + Magnitude Menu");

                    explanation = new JButton("Explanation");
                    explanation.addActionListener(this);

                    checkinteger = new JButton("Check Integer");
                    checkinteger.addActionListener(this);

                    innerCSMR = new JButton("Ranges");
                    innerCSMR.addActionListener(this);

                    worksheet = new JButton("Examples To Work Out");
                    worksheet.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(explanation);
                    buttonPanel.add(checkinteger);
                    buttonPanel.add(worksheet);
                    buttonPanel.add(innerCSMR);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null); 
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == explanation) {
                        String explanation,explanation2,explanation3,explanation4,explanation5;

                        explanation = "Sign and magnitude is a method for representing signed numbers, including both positive and negative values.\n In this system, a number is represented using two parts: the sign and the magnitude.";
                        explanation2 = "The sign of a number indicates whether the value is positive or negative.\n In the sign and magnitude system, the sign is typically represented using the leftmost bit,\n with 0 indicating a positive value and 1 indicating a negative value.";
                        explanation3 = "The magnitude of a number represents the absolute value of the number, which is the distance from zero without regard to the sign.\n The magnitude is typically represented using the remaining bits in the number.";
                        explanation4 = "For example, in an 8-bit sign and magnitude system, the number +5 would be represented as 00000101, while the number -5 would be represented as 10000101.\n Note that the leftmost bit indicates the sign, while the remaining bits represent the magnitude.";
                        explanation5 = "While sign and magnitude was once a common method for representing signed numbers,\n it has largely been replaced by more efficient and convenient systems such as two's complement.";

                        JOptionPane.showMessageDialog(null,explanation,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,explanation2,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,explanation3,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,explanation4,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,explanation5,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);                    
                    }
                    else if (e.getSource() == checkinteger) {
                        while(true){
                            // Read decimal input from the user
                            String input = JOptionPane.showInputDialog(null, "Please enter an integer within the range of -127 - +127:");

                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                                break;
                            }
                            // Convert input string to integer
                            int decimal;
                            try{
                                decimal = Integer.parseInt(input);
                            }catch (NumberFormatException f) { 
                                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                                continue;
                            }

                            // Determine the sign and magnitude of the number
                            int sign = (decimal < 0) ? 1 : 0;
                            int magnitude = Math.abs(decimal);

                            // Convert magnitude to binary string
                            String binary = Integer.toBinaryString(magnitude);

                            // Pad binary string with leading zeros to ensure it has 8 bits
                            binary = String.format("%7s", binary).replace(' ', '0');

                            // Output the sign and binary representation of magnitude
                            JOptionPane.showMessageDialog(null, "Sign-Magnitude: " + sign + binary);
                            JOptionPane.showMessageDialog(null, "Sign: " + sign + "\nMagnitude: " + binary );

                        }
                    }   else if (e.getSource() == innerCSMR) {
                        subMenuSMR = new SubMenuSMR();
                        subMenuSMR.setVisible(true);
                    } else if (e.getSource() == worksheet) {
                        subMenuSMW = new SubMenuSMW();
                        subMenuSMW.setVisible(true);
                    }
                }
            }

            class SubMenuUSW extends JFrame implements ActionListener{
                private JButton question1;
                private JButton question2;
                private JButton question3;
                public SubMenuUSW(){
                    super("Unsigned Integers Examples Menu");

                    question1 = new JButton("Question 1.");
                    question1.addActionListener(this);

                    question2 = new JButton("Question 2.");
                    question2.addActionListener(this);

                    question3 = new JButton("Question 3.");
                    question3.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(question1);
                    buttonPanel.add(question2);
                    buttonPanel.add(question3);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == question1) {
                        while (true) {
                            JOptionPane.showMessageDialog(null, "Perform the sum 1 + 9 in Unsigned Binary Representation");
                            long value1 = 1;
                            String binary1 = String.format("%8s", Long.toBinaryString(value1)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of 1: "+binary1);
                            long value2 = 9;
                            String binary2 = String.format("%8s", Long.toBinaryString(value2)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of 9: "+binary2);
                            long result;

                            if (value1 + value2 > 255) {
                                JOptionPane.showMessageDialog(null, "Overflow error. The result cannot be represented using 8 bits.");
                                continue;
                            }

                            result = value1 + value2;
                            String binaryResult = String.format("%8s", Long.toBinaryString(result)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of Result: " + binaryResult);
                            break;                
                        }
                    } else if (e.getSource() == question2) {
                        while (true) {
                            JOptionPane.showMessageDialog(null, "Perform the sum 32 + 8 in Unsigned Binary Representation");
                            long value1 = 32;
                            String binary1 = String.format("%8s", Long.toBinaryString(value1)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of 32: "+binary1);
                            long value2 = 8;
                            String binary2 = String.format("%8s", Long.toBinaryString(value2)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of 8: "+binary2);
                            long result;

                            if (value1 + value2 > 255) {
                                JOptionPane.showMessageDialog(null, "Overflow error. The result cannot be represented using 8 bits.");
                                continue;
                            }

                            result = value1 + value2;
                            String binaryResult = String.format("%8s", Long.toBinaryString(result)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of result: " + binaryResult);
                            break;                
                        }
                    } else if (e.getSource() == question3) {
                        while (true) {
                            JOptionPane.showMessageDialog(null, "Perform the sum 255 + 1 in Unsigned Binary Representation");
                            long value1 = 255;
                            String binary1 = String.format("%8s", Long.toBinaryString(value1)).replace(' ', '0');
                            long value2 = 1;
                            String binary2 = String.format("%8s", Long.toBinaryString(value2)).replace(' ', '0');
                            long result;

                            if (value1 + value2 > 255) {
                                JOptionPane.showMessageDialog(null, "Overflow error. The result cannot be represented using 8 bits.");
                                break;
                            }

                            result = value1 + value2;
                            String binaryResult = String.format("%8s", Long.toBinaryString(result)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of input 1: " + binary1 + "\nBinary of input 2: " + binary2 + "\nBinary of result: " + binaryResult);
                            break;                
                        }
                    }
                }
            }

            class SubMenuUS extends JFrame implements ActionListener{
                private JButton explanation;
                private JButton checkinteger;
                private JButton addition;

                private JButton worksheet;
                private SubMenuUSW subMenuUSW;
                public SubMenuUS() {
                    super("Unsigned Integers Menu");

                    explanation = new JButton("Explanation");
                    explanation.addActionListener(this);

                    checkinteger = new JButton("Check Integer");
                    checkinteger.addActionListener(this);

                    addition = new JButton("Addition");
                    addition.addActionListener(this);

                    worksheet = new JButton("Examples To Work Out");
                    worksheet.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(explanation);
                    buttonPanel.add(checkinteger);
                    buttonPanel.add(addition);
                    buttonPanel.add(worksheet);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);  
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == explanation) {
                        String explanation, explanation2, explanation3; // What to present in the Dialog Boxes

                        explanation = "Unsigned registers are a type of computer hardware component that can store only non-negative integers.";
                        explanation2 = "In other words, they are registers that can only hold values greater than or equal to zero.";
                        explanation3 = "The term 'unsigned' refers to the fact that the register does not have a sign bit, which means that it cannot represent negative numbers.";

                        JOptionPane.showMessageDialog(null, explanation, "Unsigned Integers Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Unsigned Integers Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation3, "Unsigned Integers Explanation", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (e.getSource() == checkinteger) {
                        while (true) {
                            String input = JOptionPane.showInputDialog("Please enter an unsigned integer within the range of 0 - 255:"); // User Input Prompt
                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // To avoid crashing when cancelling
                                break;
                            }

                            long value;
                            try { //to avoid crashing when inputting an incorrect value
                                value = Long.parseUnsignedLong(input); // User Input ; // parsing allows the conversion of a string into another variable.
                            } catch (NumberFormatException f) { //'e' exception object 
                                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                                continue;
                            }
                            String binary = String.format("%8s", Long.toBinaryString(value)).replace(' ', '0'); // to represent output with 8 digits always, regardless of the necessary bits. (always 8-bit word)
                            JOptionPane.showMessageDialog(null, "Binary: " + binary + "\nDecimal: " + value + "\nHexadecimal: " + Long.toHexString(value));            
                        }
                    }
                    else if (e.getSource() == addition) {
                        while (true) {
                            String input1 = JOptionPane.showInputDialog("Please enter the first unsigned integer within the range of 0 - 255:");
                            if (input1 == null || input1.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled");
                                break;
                            }

                            String input2 = JOptionPane.showInputDialog("Please enter the second unsigned integer within the range of 0 - 255:");
                            if (input2 == null || input2.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled");
                                break;
                            }

                            long value1, value2, result;
                            try {
                                value1 = Long.parseUnsignedLong(input1);
                                value2 = Long.parseUnsignedLong(input2);
                            } catch (NumberFormatException f) {
                                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                                continue;
                            }

                            if (value1 + value2 > 255) {
                                JOptionPane.showMessageDialog(null, "Overflow error. The result cannot be represented using 8 bits.");
                                continue;
                            }

                            String binary1 = String.format("%8s", Long.toBinaryString(value1)).replace(' ', '0');
                            String binary2 = String.format("%8s", Long.toBinaryString(value2)).replace(' ', '0');
                            result = value1 + value2;
                            String binaryResult = String.format("%8s", Long.toBinaryString(result)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary of input 1: " + binary1 + "\nBinary of input 2: " + binary2 + "\nBinary of result: " + binaryResult);
                        }
                    }
                    else if (e.getSource() == worksheet) {
                        subMenuUSW = new SubMenuUSW();
                        subMenuUSW.setVisible(true);
                    }
                }
            }

            class SubMenuBCD extends JFrame implements ActionListener{
                private JButton explanation;
                private JButton checkint;
                private JButton worksheet;
                private SubMenuBCDW subMenuBCDW;
                private JButton addition;
                public SubMenuBCD() {
                    super("Binary Coded Decimal Menu");

                    explanation = new JButton("Explanation");
                    explanation.addActionListener(this);

                    checkint = new JButton("Check Integer");
                    checkint.addActionListener(this);

                    worksheet = new JButton("Examples To Work Out");
                    worksheet.addActionListener(this);

                    addition = new JButton("Addition");
                    addition.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(explanation);
                    buttonPanel.add(checkint);
                    buttonPanel.add(worksheet);
                    buttonPanel.add(addition);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);                
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == explanation) {
                        String explanation, explanation2, explanation3, explanation4;

                        explanation  = "BCD stands for Binary-Coded Decimal, which is a way of representing decimal digits using a binary code.\nIn BCD, each decimal digit is represented by a four-bit binary code, which can take on values from 0000 to 1001.";
                        explanation2 = "For example, the decimal number 57 would be represented in BCD as 0101 0111,\nwhere the first four bits (0101) represent the digit 5 and the second four bits (0111) represent the digit 7.";
                        explanation3 = "BCD is based on the idea of representing each decimal digit as a binary number.\nSince there are 10 possible values for a decimal digit (0-9), it requires four bits to represent each digit, because four bits can represent 16 possible values.\nTherefore, in BCD, each decimal digit is represented by a unique four-bit code, with no overlap between codes.";
                        explanation4 = "One potential drawback of BCD is that it requires more storage space than traditional binary representation.\nFor example, a 16-bit binary number can represent values up to 65535, while a 16-bit BCD number can only represent values up to 9999.\nHowever, for applications that require precise decimal arithmetic or easy human readability, BCD can be a useful encoding scheme.";

                        JOptionPane.showMessageDialog(null, explanation, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation3, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation4, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (e.getSource() == checkint) { 
                        while (true) {
                            // Read decimal input from the user
                            String input = JOptionPane.showInputDialog(null, "Please Enter an Integer:");

                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled");
                                break;
                            }

                            // Convert input string to integer
                            int decimal;
                            try {
                                decimal = Integer.parseInt(input);
                            } catch (NumberFormatException f) { 
                                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                                continue;
                            }

                            // Convert decimal to BCD and display the result
                            String bcd = decimalToBCD(decimal);
                            JOptionPane.showMessageDialog(null, "BCD binary value: " + bcd);
                        }
                    }
                    else if (e.getSource() == worksheet) {
                        subMenuBCDW = new SubMenuBCDW();
                        subMenuBCDW.setVisible(true);
                    }
                    else if (e.getSource() == addition) {
                        performAddition();
                    }
                }

                public void performAddition() {
                    while (true) {
                        String input1 = JOptionPane.showInputDialog(null, "Please Enter the First Integer:");

                        if (input1 == null || input1.equalsIgnoreCase("q")) {
                            JOptionPane.showMessageDialog(null, "Operation Cancelled");
                            break;
                        }

                        // Convert the first input string to an integer
                        int firstInt;
                        try {
                            firstInt = Integer.parseInt(input1);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                            continue;
                        }

                        // Prompt the user to enter the second integer
                        String input2 = JOptionPane.showInputDialog(null, "Please Enter the Second Integer:");

                        if (input2 == null || input2.equalsIgnoreCase("q")) {
                            JOptionPane.showMessageDialog(null, "Operation Cancelled");
                            break;
                        }

                        // Convert the second input string to an integer
                        int secondInt;
                        try {
                            secondInt = Integer.parseInt(input2);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                            continue;
                        }

                        // Perform BCD addition
                        int sum = firstInt + secondInt;

                        // Convert decimal sum to BCD and display the result
                        String bcd2 = decimalToBCD(sum);
                        String bcd3 = decimalToBCD(firstInt);
                        String bcd4 = decimalToBCD(secondInt);

                        JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                        JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                        JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
                    }
                }

                class SubMenuBCDW extends JFrame implements ActionListener{
                    private JButton question1;
                    private JButton question2;
                    private JButton question3;
                    public SubMenuBCDW() {
                        super("Binary Coded Decimal Examples Menu");

                        question1 = new JButton("Question 1.");
                        question1.addActionListener(this);

                        question2 = new JButton("Question 2.");
                        question2.addActionListener(this);

                        question3 = new JButton("Question 3.");
                        question3.addActionListener(this);

                        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                        buttonPanel.add(question1);
                        buttonPanel.add(question2);
                        buttonPanel.add(question3);

                        getContentPane().setLayout(new BorderLayout());
                        getContentPane().add(buttonPanel, BorderLayout.CENTER);

                        setSize(400, 140);
                        setLocationRelativeTo(null);
                    }

                    public void actionPerformed(ActionEvent e){
                        if (e.getSource() == question1) {
                            JOptionPane.showMessageDialog(null, "Perform 50 + 50 in BCD:");

                            int firstInt = 50;
                            int secondInt = 50;

                            // Perform BCD addition
                            int sum = firstInt + secondInt;

                            // Convert decimal sum to BCD and display the result
                            String bcd2 = decimalToBCD(sum);
                            String bcd3 = decimalToBCD(firstInt);
                            String bcd4 = decimalToBCD(secondInt);

                            JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                            JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                            JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
                        } else if (e.getSource() == question2) {
                            JOptionPane.showMessageDialog(null, "Perform 62 + 44 in BCD:");

                            int firstInt = 62;
                            int secondInt = 44;

                            // Perform BCD addition
                            int sum = firstInt + secondInt;

                            // Convert decimal sum to BCD and display the result
                            String bcd2 = decimalToBCD(sum);
                            String bcd3 = decimalToBCD(firstInt);
                            String bcd4 = decimalToBCD(secondInt);

                            JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                            JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                            JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
                        } else if (e.getSource() == question3) {
                            JOptionPane.showMessageDialog(null, "Perform 77 + 56 in BCD:");

                            int firstInt = 77;
                            int secondInt = 56;

                            // Perform BCD addition
                            int sum = firstInt + secondInt;

                            // Convert decimal sum to BCD and display the result
                            String bcd2 = decimalToBCD(sum);
                            String bcd3 = decimalToBCD(firstInt);
                            String bcd4 = decimalToBCD(secondInt);

                            JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                            JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                            JOptionPane.showMessageDialog(null, "BCD value of sum: " + bcd2);
                        }
                    }

                    public String decimalToBCD(int decimal){
                        StringBuilder bcd = new StringBuilder();

                        while (decimal > 0){
                            int digit = decimal % 10;
                            String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
                            bcd.insert(0, binary);
                            decimal /= 10;
                        }

                        // Split the BCD representation into groups of four digits
                        for (int i = bcd.length() - 4; i > 0; i -= 4) {
                            bcd.insert(i," ");
                        }

                        return bcd.toString();
                    }
                }
            }   

            public String decimalToBCD(int decimal){
                StringBuilder bcd = new StringBuilder();

                while (decimal > 0){
                    int digit = decimal % 10;
                    String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
                    bcd.insert(0, binary);
                    decimal /= 10;
                }
                // Split the BCD representation into groups of four digits
                for (int i = bcd.length() - 4; i > 0; i -= 4) {
                    bcd.insert(i," ");
                }
                return bcd.toString();   
            }

            class SubMenu2CW extends JFrame implements ActionListener{
                private JButton question1;
                private JButton question2;
                public SubMenu2CW(){
                    super("2's Complement Examples Menu");

                    question1 = new JButton("Question 1.");
                    question1.addActionListener(this);

                    question2 = new JButton("Question 2.");
                    question2.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(question1);
                    buttonPanel.add(question2);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == question1) {
                        while (true) {
                            JOptionPane.showMessageDialog(null, "Perform The Sum : 20 + 6 in 2's Complement Representation");
                            byte decimal = 20;
                            String binaryNum1 = String.format("%8s", Integer.toBinaryString(decimal & 0xFF)).replace(' ', '0');
                            byte decimal2 = 6;
                            String binaryNum2 = String.format("%8s", Integer.toBinaryString(decimal2 & 0xFF)).replace(' ', '0');
                            int sum = decimal + decimal2;
                            boolean overflow = sum > 127 || sum < -128;
                            if (overflow) {
                                JOptionPane.showMessageDialog(null, "Overflow error: the result is out of range.");
                                continue;
                            } else {

                                String binarySum = Integer.toBinaryString(sum & 0xFF);
                                binarySum = String.format("%8s", binarySum).replace(' ', '0');

                                JOptionPane.showMessageDialog(null, "Binary representation of " + decimal + " is " + binaryNum1);
                                JOptionPane.showMessageDialog(null, "Binary representation of " + decimal2 + " is " + binaryNum2);

                                JOptionPane.showMessageDialog(null, "Binary representation of the sum of " + decimal + " and " + decimal2 + " is " + binarySum);

                            }
                            break;
                        }
                    } else if (e.getSource() == question2) {
                        while (true) {
                            JOptionPane.showMessageDialog(null, "Perform The Sum : 20 + (-6) in 2's Complement Representation");
                            byte decimal = 20;
                            String binaryNum1 = String.format("%8s", Integer.toBinaryString(decimal & 0xFF)).replace(' ', '0');
                            byte decimal2 = -6;
                            String binaryNum2 = String.format("%8s", Integer.toBinaryString(decimal2 & 0xFF)).replace(' ', '0');
                            int sum = decimal + decimal2;
                            boolean overflow = sum > 127 || sum < -128;
                            if (overflow) {
                                JOptionPane.showMessageDialog(null, "Overflow error: the result is out of range.");
                                continue;
                            } else {

                                String binarySum = Integer.toBinaryString(sum & 0xFF);
                                binarySum = String.format("%8s", binarySum).replace(' ', '0');

                                JOptionPane.showMessageDialog(null, "Binary representation of " + decimal + " is " + binaryNum1);
                                JOptionPane.showMessageDialog(null, "Binary representation of " + decimal2 + " is " + binaryNum2);

                                JOptionPane.showMessageDialog(null, "Binary representation of the sum of " + decimal + " and " + decimal2 + " is " + binarySum);

                            }
                            break;
                        }
                    }
                }
            }

            class SubMenu2CR extends JFrame implements ActionListener{
                private JButton explanation;
                private JButton checkrange;

                public SubMenu2CR(){
                    super("2's Complement Ranges Menu");

                    explanation = new JButton("Explanation");
                    explanation.addActionListener(this);

                    checkrange = new JButton("Check Range");
                    checkrange.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(explanation);
                    buttonPanel.add(checkrange);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400,140);
                    setLocationRelativeTo(null);
                }

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == explanation) {
                        String explanation, explanation2, explanation3, explanation4, explanation5, explanation6;

                        explanation  = "Ranges refer to the set of values that can be represented by a particular data type or number system.\nIn computer programming, ranges are often used to determine the valid input values for a variable or to define the limits of a computation.";
                        explanation2 = "To Calculate The Range of a 2's Complement Representation we must to the following :";
                        explanation3 = "Step 1 : Calculate 2 to the power of the number of bits you have. \n2^8 = 256";
                        explanation4 = "Step 2 : Find the negative range by halving the answer. \n 256/2 = 128";
                        explanation5 = "Step 3 : This means we have the range of: \n-128 to +128";
                        explanation6 = "Step 4 : We need to take account the number 0 in our calculation, simply subtract 1 from the positive side.\n Our new answer is : -128 to +127";

                        JOptionPane.showMessageDialog(null, explanation, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation3, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation4, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation5, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation6, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);

                    } else if (e.getSource() == checkrange) {
                        while (true) {
                            // Read decimal input from the user
                            String input = JOptionPane.showInputDialog(null, "Enter The Number of Bits in the Representation :");

                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled");
                                break;
                            }

                            // Convert input string to integer
                            int bits;
                            try {
                                bits = Integer.parseInt(input);
                            }   catch (NumberFormatException f) { 
                                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                                continue;
                            }

                            int minValue = -(1 << (bits - 1)); // minimum value that can be represented 
                            int maxValue = (1 << (bits - 1)) - 1; // maximum value that can be represented

                            JOptionPane.showMessageDialog(null, "Range of values in " + bits + "-bit 2's complement: \nMinimum value: "+ minValue + "\nMaximum value: "+ maxValue);

                        }
                    }
                }
            }
            class SubMenu2C extends JFrame implements ActionListener{
                private JButton explanation;
                private JButton addition;
                private JButton checkinteger;

                private JButton innerC2CR;
                private SubMenu2CR subMenu2CR;

                private JButton worksheet;
                private SubMenu2CW subMenu2CW;

                public SubMenu2C(){
                    super("2's Complement Menu");

                    explanation = new JButton("Explanation");
                    explanation.addActionListener(this);

                    addition = new JButton("Sum");
                    addition.addActionListener(this);

                    innerC2CR = new JButton("Ranges");
                    innerC2CR.addActionListener(this);

                    checkinteger = new JButton("Check Integer");
                    checkinteger.addActionListener(this);

                    worksheet = new JButton("Examples To Work Out");
                    worksheet.addActionListener(this);

                    JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 10, 5));
                    buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                    buttonPanel.add(explanation);
                    buttonPanel.add(addition);
                    buttonPanel.add(checkinteger);

                    buttonPanel.add(innerC2CR);

                    buttonPanel.add(worksheet);

                    getContentPane().setLayout(new BorderLayout());
                    getContentPane().add(buttonPanel, BorderLayout.CENTER);

                    setSize(400, 140);
                    setLocationRelativeTo(null); 
                }   

                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == explanation) {
                        String explanation, explanation2, explanation3, explanation4;

                        explanation = "2's complement is a way of representing signed integers in binary form.\n It is based on the idea of complementing a number,\n which means finding its opposite value, and adding one to it.";
                        explanation2 = "To represent a negative number in 2's complement,\n you take the binary representation of its absolute value (positive equivalent),\n invert all the bits (change 1s to 0s and 0s to 1s), and then add one to the result.\n The resulting binary number represents the negative value of the original number.";
                        explanation3 = "In 2's complement, the leftmost bit is used to indicate the sign of the number.\n If the leftmost bit is 1, the number is negative, and if it's 0, the number is positive.";
                        explanation4 = "2's complement allows the computer to perform arithmetic operations such as addition,\n subtraction, and multiplication on both positive and negative numbers using the same circuitry.";

                        JOptionPane.showMessageDialog(null, explanation, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation2, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation3, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, explanation4, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
                    } else if (e.getSource() == addition) {
                        while (true) {
                            String input = JOptionPane.showInputDialog("Enter an integer within the range of -128 to 127");

                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                                break;
                            }
                            byte decimal;
                            try {
                                decimal = Byte.parseByte(input);
                            } catch (NumberFormatException f) {
                                JOptionPane.showMessageDialog(null, "Invalid Input.\nPlease enter an appropriate Integer.");
                                continue;
                            }
                            String input2 = JOptionPane.showInputDialog("Enter an integer within the range of -128 to 127");

                            if (input2 == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                                break;
                            }
                            byte decimal2;
                            try {
                                decimal2 = Byte.parseByte(input2);
                            } catch (NumberFormatException f) {
                                JOptionPane.showMessageDialog(null, "Invalid Input.\nPlease enter an appropriate Integer.");
                                continue;
                            }
                            int sum = decimal + decimal2;
                            boolean overflow = sum > 127 || sum < -128;
                            if (overflow) {
                                JOptionPane.showMessageDialog(null, "Overflow error: the result is out of range.");
                                continue;
                            } else {
                                String binaryNum1 = String.format("%8s", Integer.toBinaryString(decimal & 0xFF)).replace(' ', '0');
                                String binaryNum2 = String.format("%8s", Integer.toBinaryString(decimal2 & 0xFF)).replace(' ', '0');

                                String binarySum = Integer.toBinaryString(sum & 0xFF);
                                binarySum = String.format("%8s", binarySum).replace(' ', '0');

                                JOptionPane.showMessageDialog(null, "Binary representation of " + decimal + " is " + binaryNum1);
                                JOptionPane.showMessageDialog(null, "Binary representation of " + decimal2 + " is " + binaryNum2);

                                JOptionPane.showMessageDialog(null, "Binary representation of the sum of " + decimal + " and " + decimal2 + " is " + binarySum);

                            }
                        }
                    } else if (e.getSource() == innerC2CR) {
                        subMenu2CR = new SubMenu2CR();
                        subMenu2CR.setVisible(true);
                    } else if (e.getSource() == checkinteger) {
                        while (true) {
                            String input = JOptionPane.showInputDialog("Enter an integer within the range of -128 to 127");

                            if (input == null || input.equalsIgnoreCase("q")) {
                                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                                break;
                            }

                            byte decimal;
                            try {
                                decimal = Byte.parseByte(input);
                            } catch (NumberFormatException f) {
                                JOptionPane.showMessageDialog(null, "Invalid Input.\nPlease enter an appropriate Integer.");
                                continue;
                            }

                            String binaryNum1 = String.format("%8s", Integer.toBinaryString(decimal & 0xFF)).replace(' ', '0');
                            JOptionPane.showMessageDialog(null, "Binary representation of " + decimal + " is " + binaryNum1);
                        }
                    } else if (e.getSource() == worksheet) {
                        subMenu2CW = new SubMenu2CW();
                        subMenu2CW.setVisible(true);
                    }
                }   
            }
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == innerCBCD) {
                    subMenuBCD = new SubMenuBCD();
                    subMenuBCD.setVisible(true);
                } else if (e.getSource() == innerC2C) {
                    subMenu2C = new SubMenu2C();
                    subMenu2C.setVisible(true);
                } else if (e.getSource() == innerCUS) {
                    subMenuUS = new SubMenuUS();
                    subMenuUS.setVisible(true);
                } else if (e.getSource() == innerCSM) {
                    subMenuSM = new SubMenuSM();
                    subMenuSM.setVisible(true);
                }
            }
        }
    }
    public static void main(String[] args){
        Essentials mainMenu = new Essentials();
        mainMenu.setVisible(true);
    }
}

