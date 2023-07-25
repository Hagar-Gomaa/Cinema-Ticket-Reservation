import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.testcompose.ui.theme.Orange

@Composable
fun CircleShapeExample(modifier: Modifier) {
    // Usage of the custom circle shape in a Surface composable
    Surface(
        modifier = modifier,
        color = Orange,
        shape = RoundedCornerShape(percent = 50) // Set percent to 50 to make it a circle
    ) {
        // Content inside the Surface with the circle shape
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Orange)
        )
    }
}

// Usage example:
//@Composable
//fun MyScreen() {
//    CircleShapeExample()
//}
