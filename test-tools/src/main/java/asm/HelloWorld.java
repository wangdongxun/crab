package asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.*;

import static org.objectweb.asm.Opcodes.GETSTATIC;

/**
 * Created by wdx on 2016/11/18.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        ClassReader cr = new ClassReader(is);
//        ClassNode cn = new ClassNode();
//        cr.accept(cn, 0);
//        for (Object object : cn.methods) {
//            MethodNode mn = (MethodNode) object;
//            if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name)) {
//                continue;
//            }
//            InsnList insns = mn.instructions;
//            InsnList il = new InsnList();
//            il.add(new FieldInsnNode(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;"));
//            il.add(new LdcInsnNode("Enter method -> " + mn.name));
////            il.add(new MethodInsnNode(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V"));
//            insns.insert(il);  mn.maxStack += 3;
//        }
//        ClassWriter cw = new ClassWriter(0);
//        cn.accept(cw);
//        byte[] b = cw.toByteArray();
    }
}
