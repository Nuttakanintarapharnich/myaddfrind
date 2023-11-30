package com.example.rab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.rab1.ui.theme.Rab1Theme

data class Person(val name: String, val imageId: Int, val studentId: String)

class MainActivity : ComponentActivity() {

    val persons: List<Person> = listOf<Person>(
        Person(   "   นายกมล จันบุตรดี	", R.drawable.ark, "643450063-8"),
      Person("นายจักรพรรดิ์ อนุไพร", R.drawable.a02,"643450065-4"),
      Person("ชาญณรง  เเต่งเมือง", R.drawable.a03, "643450069-6"),
      Person("ชาญณรง  เเต่งเมือง์", R.drawable.a04,"643450069-6"),
      Person("นายณัฐกานต์ อินทรพานิชย์", R.drawable.a05,"643450072-7"),
      Person("ณัฐปกรณ์ ณ หนองคาย", R.drawable.a06,"643450073-5"),
      Person("ณิชกานต์ ไทยภักดี", R.drawable.a07, "643450074-3"),
      Person("ทัศนีย์ มลาตรี", R.drawable.a08, " 643450075-1"),
      Person("ธนาธิป เตชะ", R.drawable.a09, "643450076-9"),
      Person("ญาณศรณ์ คำพูล", R.drawable.a10, "643450070-1"),
      Person("ปรเมศวร์ สิทธิมงคล", R.drawable.a11,"643450078-5"),
      Person("พีระเดช โพธิ์หล้า", R.drawable.a12, "643450082-4"),
      Person("วิญญู พรมภิภักดิ์", R.drawable.a13, "643450084-0"),
      Person("ศรันย์ ซุ่นเส้ง์", R.drawable.a14, "643450086-6"),
      Person("ศุภชัย แสนประสิทธิ์", R.drawable.a15,"643450332-7"),
      Person("อชิตพล สุทธิสน", R.drawable.a16, "643450091-3"),
      Person("อภิทุน ดวงจันทร์คล้อยO", R.drawable.a17, "643450092-1"),
      Person("อมรรัตน์ มาระเหว", R.drawable.a18,"643450094-7"),
      Person("อรัญ ศรีสวัสดิ์", R.drawable.a19,"643450095-5"),
      Person("ก้องภพ ตาดี", R.drawable.a20,"643450321-2"),
      Person("เกรียงศักดิ์ หมู่เมืองสอง", R.drawable.a21, "643450322-0"),
      Person("ธนบดี สวัสดี", R.drawable.a22, "643450325-4"),
      Person("นภาปิลันธ์ ชาวชายโขง", R.drawable.a23, "643450327-0"),
      Person("นริศรา วงค์บุตรศรี", R.drawable.a24, "643450328-8"),
      Person("วรรณภา เบ้านาค", R.drawable.a25, "643450330-1"),
      Person("อฆพร ไร่ขาม", R.drawable.a26, "643450334-3"),
      Person("กฤตวัฒน์ อินทรสิทธิ์", R.drawable.a27, "643450644-8"),
      Person("เทพทินกร พรมโสภา", R.drawable.a28, "643450648-0"),
      Person("รัตพงษ์ ปานเจริญ", R.drawable.a29,"643450650-3"),
      Person("ประสิทธิชัย จันทร์สม", R.drawable.a30,"643450079-3"),

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rab1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn {
                        items(persons) { person ->
                            PersonListItem(person)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PersonListItem(data: Person) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(id = data.imageId),
            contentDescription = "Avatar image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(data.name)
            Text(data.studentId)
        }
    }
}