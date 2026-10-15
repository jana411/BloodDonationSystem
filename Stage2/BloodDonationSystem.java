/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biooddonationsystem;

// استدعاء  JOptionPane لإظهار نوافذ الإدخال والرسائل
import javax.swing.JOptionPane;

// الكلاس الرئيسي لنظام إدارة التبرع بالدم
public class BloodDonationSystem {
    // الميثود الرئيسية التي يبدأ منها تشغيل البرنامج
    public static void main(String[] args) {

        // نستخدم try للتعامل مع الأخطاء المحتملة أثناء إدخال البيانات
        try {

            // نطلب من المستخدم إدخال رقم المتبرع
            String idInput = JOptionPane.showInputDialog(
                "Enter donor ID:"
            );

            // إذا ضغط المستخدم Cancel ينتهي البرنامج
            if (idInput == null) return;

            // تحويل رقم المتبرع من نص إلى عدد صحيح
            int donorId = Integer.parseInt(idInput.trim());

            // التحقق من أن رقم المتبرع أكبر من صفر
            if (donorId <= 0) {
                JOptionPane.showMessageDialog(null,
                    "Donor ID must be greater than zero.");
                return;
            }

            // نطلب من المستخدم إدخال اسم المتبرع
            String donorName = JOptionPane.showInputDialog(
                "Enter donor name:"
            );

            // إنهاء البرنامج إذا ضغط المستخدم Cancel
            if (donorName == null) return;

            // التحقق من أن اسم المتبرع ليس فارغًا
            if (donorName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Donor name cannot be empty.");
                return;
            }

            // نطلب من المستخدم إدخال عمر المتبرع
            String ageInput = JOptionPane.showInputDialog(
                "Enter donor age:"
            );

            // إنهاء البرنامج إذا ضغط المستخدم Cancel
            if (ageInput == null) return;

            // تحويل العمر من نص إلى عدد صحيح
            int age = Integer.parseInt(ageInput.trim());

            // التحقق من أن العمر ليس قيمة سالبة
            if (age < 0) {
                JOptionPane.showMessageDialog(null,
                    "Age cannot be negative.");
                return;
            }

            // نطلب من المستخدم إدخال وزن المتبرع
            String weightInput = JOptionPane.showInputDialog(
                "Enter donor weight:"
            );

            // إنهاء البرنامج إذا ضغط المستخدم Cancel
            if (weightInput == null) return;

            // تحويل الوزن من نص إلى عدد عشري
            double weight = Double.parseDouble(weightInput.trim());

            // التحقق من أن الوزن رقم موجب وصالح
            if (!Double.isFinite(weight) || weight <= 0) {
                JOptionPane.showMessageDialog(null,
                    "Weight must be a positive number.");
                return;
            }

            // نطلب من المستخدم إدخال فصيلة الدم
            String bloodType = JOptionPane.showInputDialog(
                "Enter blood type:"
            );

            // إنهاء البرنامج إذا ضغط المستخدم Cancel
            if (bloodType == null) return;

            // التحقق من أن فصيلة الدم ليست فارغة
            if (bloodType.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Blood type cannot be empty.");
                return;
            }

            // إنشاء كائن من كلاس Donor باستخدام البيانات المدخلة
            Donor donor1 = new Donor(
                donorId, donorName.trim(),
                age, weight, bloodType.trim()
            );

            // استدعاء ميثود التحقق من العمر وعرض النتيجة
            // العمر المقبول للتبرع من 18 إلى 65 سنة
            JOptionPane.showMessageDialog(null,
                donor1.checkAge() ? "Valid Age" : "Invalid Age"
            );

            // استدعاء ميثود التحقق من الوزن وعرض النتيجة
            // الوزن المقبول للتبرع هو 50 كجم أو أكثر
            JOptionPane.showMessageDialog(null,
                donor1.checkWeight() ? "Valid Weight" : "Invalid Weight"
            );

        // التقاط الخطأ إذا أدخل المستخدم حروفًا بدل الأرقام
        // أو أدخل رقمًا بصيغة غير صحيحة
        } catch (NumberFormatException e) {

            // عرض رسالة خطأ بدل توقف البرنامج بشكل مفاجئ
            JOptionPane.showMessageDialog(null,
                "Invalid input! Please enter a valid number.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}

