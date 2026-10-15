/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.biooddonationsystem;

// استدعاء  JOptionPane لعرض الرسائل
import javax.swing.JOptionPane;

// كلاس المتبرع ويحتوي على بياناته والميثودز الخاصة به
public class Donor {

    // تعريف خصائص المتبرع باستخدام private
    // لتطبيق مبدأ التغليف Encapsulation

    // الرقم التعريفي للمتبرع
    private int donorId;

    // اسم المتبرع
    private String donorName;

    // عمر المتبرع
    private int age;

    // وزن المتبرع بالكيلوجرام
    private double weight;

    // فصيلة دم المتبرع
    private String bloodType;


    // Constructor يستقبل بيانات المتبرع عند إنشاء كائن جديد
    public Donor(int donorId, String donorName,
                 int age, double weight, String bloodType) {

        // تخزين رقم المتبرع داخل الكائن
        this.donorId = donorId;

        // تخزين اسم المتبرع داخل الكائن
        this.donorName = donorName;

        // تخزين عمر المتبرع داخل الكائن
        this.age = age;

        // تخزين وزن المتبرع داخل الكائن
        this.weight = weight;

        // تخزين فصيلة الدم داخل الكائن
        this.bloodType = bloodType;
    }


    // ميثود للتحقق من أن عمر المتبرع مناسب للتبرع
    public boolean checkAge() {

        // ترجع true إذا كان العمر بين 18 و65
        // وترجع false إذا كان خارج هذا النطاق
        return age >= 18 && age <= 65;
    }


    // ميثود للتحقق من أن وزن المتبرع مناسب للتبرع
    public boolean checkWeight() {

        // ترجع true إذا كان الوزن 50 كجم أو أكثر
        // وترجع false إذا كان أقل من 50 كجم
        return weight >= 50;
    }


    // Getters تستخدم لقراءة قيم الخصائص الخاصة بالكلاس

    // إرجاع الرقم التعريفي للمتبرع
    public int getDonorId() {
        return donorId;
    }

    // إرجاع اسم المتبرع
    public String getDonorName() {
        return donorName;
    }

    // إرجاع عمر المتبرع
    public int getAge() {
        return age;
    }

    // إرجاع وزن المتبرع
    public double getWeight() {
        return weight;
    }

    // إرجاع فصيلة دم المتبرع
    public String getBloodType() {
        return bloodType;
    }


    // Setters تستخدم لتعديل قيم الخصائص الخاصة بالكلاس

    // تعديل الرقم التعريفي للمتبرع
    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    // تعديل اسم المتبرع
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    // تعديل عمر المتبرع
    public void setAge(int age) {
        this.age = age;
    }

    // تعديل وزن المتبرع
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // تعديل فصيلة دم المتبرع
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }


    // ميثود رئيسية لتجربة كلاس Donor بشكل مستقل
    public static void main(String[] args) {

        // إنشاء كائن جديد يمثل متبرعًا ببيانات تجريبية
        Donor donor1 = new Donor(1, "Jana", 20, 55.0, "O+");

        // التحقق من العمر وعرض النتيجة للمستخدم
        JOptionPane.showMessageDialog(null,
            donor1.checkAge() ? "Valid Age" : "Invalid Age"
        );

        // التحقق من الوزن وعرض النتيجة للمستخدم
        JOptionPane.showMessageDialog(null,
            donor1.checkWeight() ? "Valid Weight" : "Invalid Weight"
        );
    }
}
